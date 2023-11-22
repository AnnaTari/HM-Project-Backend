package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Winner;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class WinnerRepository {
    private static final Logger log = LoggerFactory.getLogger(WinnerRepository.class);

    private final EntityManager entityManager;

    public WinnerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //fetch winner and related information and map raw result to winner objects
    public List<Winner> findByEventHsvId(Long eventHsvId) {
        try {
            final List<?> winnersRaw = entityManager.createNativeQuery("""
                SELECT a.employee_id, a.event_hsv_id, escort_name, winner, substitute_winner, employee_email, employee_name, blacklist_counter 
                FROM hm_attendance a 
                JOIN employee e ON a.employee_id = e.employee_id 
                JOIN blacklist bl ON a.employee_id = bl.employee_id 
                WHERE a.event_hsv_id = :eventHsvId""").setParameter("eventHsvId", eventHsvId).getResultList();
            final List<Winner> winners = winnersRaw.stream().map(object -> {
                Winner winner = new Winner();
                winner.setEmployeeId((int) ((Object[]) object)[0]);
                winner.setEventHsvId((int) ((Object[]) object)[1]);
                winner.setEscortName((String) ((Object[]) object)[2]);
                winner.setWinner((Boolean) ((Object[]) object)[3]);
                winner.setSubstituteWinner((Boolean) ((Object[]) object)[4]);
                winner.setEmail((String) ((Object[]) object)[5]);
                winner.setName((String) ((Object[]) object)[6]);
                winner.setBlacklistCounter((int) ((Object[]) object)[7]);
                return winner;
            }).collect(Collectors.toList());

            return winners;
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }

    //update the escortName, winner, and substituteWinner of the selected winners and substitute winners
    public List<Winner> saveToAttendance(Winner winner) {
        try {
            entityManager.createNativeQuery("""
                    UPDATE hm_attendance 
                    SET escort_name = :escortName, winner = :winner, substitute_winner = :substituteWinner 
                    WHERE employee_id = :employeeId AND event_hsv_id = :eventHsvId""", Winner.class)
                    .setParameter("employeeId", winner.getEmployeeId())
                    .setParameter("eventHsvId", winner.getEventHsvId())
                    .setParameter("escortName", winner.getEscortName())
                    .setParameter("winner", winner.isWinner())
                    .setParameter("substituteWinner", winner.isSubstituteWinner())
                    .executeUpdate();

        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }

    //set blacklistcounter for winners to 3
    @Transactional
    public void maximizeBlacklistCounter(Winner winner) {
        try {
            entityManager.createNativeQuery("""
                    UPDATE blacklist 
                    SET blacklist_counter = 3 
                    WHERE employee_id =:employeeId AND event_hsv_id = :eventHsvId""")
                    .setParameter("employeeId", winner.getEmployeeId())
                    .setParameter("eventHsvId", winner.getEventHsvId())
                    .executeUpdate();
        } catch (Exception e) {
            log.error("Error while maximizing blacklistCounter",e);
        }
    }

    //decrease blacklistcounter for non-winning participants by 1
    @Transactional
    public void decreaseBlacklistCounter(Winner winner) {
        try {
            entityManager.createNativeQuery("""
                    UPDATE blacklist 
                    SET blacklist_counter = :blacklistCounter 
                    WHERE employee_id =:employeeId AND event_hsv_id = :eventHsvId""")
                    .setParameter("employeeId", winner.getEmployeeId())
                    .setParameter("eventHsvId", winner.getEventHsvId())
                    .setParameter("blacklistCounter", Math.max(0,winner.getBlacklistCounter() -1)) //blacklistcounter cannot be below 0
                    .executeUpdate();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
    }
}
