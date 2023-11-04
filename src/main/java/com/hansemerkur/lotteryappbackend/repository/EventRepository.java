package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Event;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

//is called by LandService and connection to the database is established
@Transactional
@Repository
public class EventRepository {
    private static final Logger log = LoggerFactory.getLogger(EventRepository.class);

    private final EntityManager entityManager;

    public EventRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Event> findAllEvents() {
        try {
            return (List<Event>) entityManager.createNativeQuery(
                            "SELECT * FROM  event_hsv a", Event.class)
                    .getResultList();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }

    public List<Event> addEvent(Event event) {
        try {
            entityManager.createNativeQuery("INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, location, picture,  deadline, ticket_type, ticket_amount, registration_date) VALUES (:adminId,:matchName, :matchDetails, :eventDate, :location, :picture, :deadline, :ticketType, :ticketAmount, :registrationDate)", Event.class)
                    .setParameter("adminId", event.getAdminId())
                    .setParameter("matchName", event.getMatchName())
                    .setParameter("matchDetails", event.getMatchDetails())
                    .setParameter("eventDate", event.getEventDate())
                    .setParameter("location", event.getLocation())
                    .setParameter("picture", event.getPicture())
                    .setParameter("deadline", event.getDeadline())
                    .setParameter("ticketType", event.getTicketType())
                    .setParameter("ticketAmount", event.getTicketAmount())
                    .setParameter("registrationDate", event.getRegistrationDate())
                    .executeUpdate();
            return findAllEvents();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }

    public List<Event> deleteEvent(Event event) {
        System.out.println("deleteEvent");
        try {
            entityManager.createNativeQuery("Delete from event_hsv where event_hsv_id = :eventHsvId")
                    .setParameter("eventHsvId", event.getEventHsvId())
                    .executeUpdate();
            return findAllEvents();
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return List.of();
    }
}
