package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Winner;
import jakarta.persistence.EntityManager;
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

    //fetch all participants from hm_attendance table of the chosen event
    public List<Winner> findByEventHsvId(Long eventHsvId) {
        System.out.println("SQL");
        try {
            final List winnersRaw = entityManager.createNativeQuery("SELECT * FROM hm_attendance a JOIN employee e ON a.employee_id = e.employee_id").getResultList();
            final List<Winner> winners = (List<Winner>) winnersRaw.stream().map(object -> {
                Winner winner = new Winner();
                winner.setEmployee_id((int) ((Object[]) object)[0]);
                winner.setEventHsvId((int) ((Object[]) object)[1]);
                winner.setEscortName((String) ((Object[]) object)[2]);
                winner.setWinner((Boolean) ((Object[]) object)[3]);
                winner.setSubstituteWinner((Boolean) ((Object[]) object)[4]);
                winner.setEmail((String) ((Object[]) object)[6]);
                winner.setName((String) ((Object[]) object)[7]);
                return winner;
            }).collect(Collectors.toList());

            return winners;
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }

    //updates the escort_name, winner, and substitute_winner columns for the row where employee_id and event_hsv_id match the winners
    public List<Winner> saveToAttendance(Winner winner) {
        try {
            entityManager.createNativeQuery("update hm_attendance set escort_name = :escortName, winner = :winner, substitute_winner = :substituteWinner where employee_id = :employeeId and event_hsv_id = :eventHsvId", Winner.class)
                    .setParameter("employeeId", winner.getEmployee_id())
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

    //insert blacklistcounter into blacklist table
    public List<Winner> saveToBlacklist(Winner winner) {
        try {
            entityManager.createNativeQuery("insert into blacklist (blacklist_counter) values (:blacklistCounter where employee_id =:employeeId and event_hsv_Id = :eventHsvId", Winner.class)
                    .setParameter("blacklistCounter", winner.getBlacklistCounter())
                    .executeUpdate();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }
}
