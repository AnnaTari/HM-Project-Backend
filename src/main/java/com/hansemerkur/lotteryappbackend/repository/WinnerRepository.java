package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.model.Winner;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class WinnerRepository {
    private static final Logger log = LoggerFactory.getLogger(WinnerRepository.class);

    private final EntityManager entityManager;

    public WinnerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Winner> findByEventHsvId () {
        System.out.println("SQL");
        try {
            return (List<Winner>) entityManager.createNativeQuery(
                            "SELECT * FROM  hm_attendance a", Winner.class)
                    .getResultList();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }

    //update blacklistcounter of the winner entities
    public void save(Winner winner) {
        try {
            entityManager.getTransaction().begin();
            if (winner.getEmployee_id() == null) {
                // New entity
                entityManager.persist(winner);
            } else {
                // Existing entity
                entityManager.merge(winner);
            }
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            log.warn(e.getMessage());
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        }
    }

}
