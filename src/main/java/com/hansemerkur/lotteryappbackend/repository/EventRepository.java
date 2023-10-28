package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Event;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

//is called by LandService and connection to the database is established
@Repository
public class EventRepository {
    private static final Logger log = LoggerFactory.getLogger(EventRepository.class);
    private final EntityManager entityManager;

    public EventRepository (EntityManager entityManager) { this.entityManager = entityManager;}

    public List<Event> findAllEvents() {
        System.out.println("SQL");
        try {
            return (List<Event>) entityManager.createNativeQuery(
                            "SELECT * FROM  event_hsv a" , Event.class)
                    .getResultList();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }
}
