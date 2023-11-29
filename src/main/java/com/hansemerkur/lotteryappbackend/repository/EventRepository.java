
package com.hansemerkur.lotteryappbackend.repository;

import com.hansemerkur.lotteryappbackend.model.Event;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

//Through this annotation you can open a transaction to commit your changes to the database
@Transactional
@Repository
public class EventRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventRepository.class);

    private final EntityManager entityManager;

    public EventRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //Selects all events from the event_hsv table
    public List<Event> findAllEvents() {
        try {
            return (List<Event>) entityManager.createNativeQuery(
                            "SELECT * FROM  event_hsv a", Event.class)
                    .getResultList();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
        return List.of();
    }

    //Adds an event with the given information from the admin in the frontend and it commits it
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
            LOGGER.warn(e.getMessage());
        }
        return List.of();
    }

    //Deletes an event by the unique event_hsv_id and commits the changes
    public List<Event> deleteEvent(Event event) {
        this.deleteForeignReferencesFromAttendance(event.getEventHsvId());
        try {
            entityManager.createNativeQuery("Delete from event_hsv where event_hsv_id = :eventHsvId")
                    .setParameter("eventHsvId", event.getEventHsvId())
                    .executeUpdate();
            return findAllEvents();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
        return List.of();
    }

    //Updates all fields of an event by the unique event_hsv_id and commits the changes
    public List<Event> updateEvent(Event event) {
        this.deleteForeignReferencesFromAttendance(event.getEventHsvId());
        try {
            entityManager.createNativeQuery("UPDATE event_hsv SET  admin_id = :adminId, match_name = :matchName, match_details = :matchDetails, event_date = :eventDate, location = :location, picture = :picture, deadline = :deadline, ticket_type = :ticketType, ticket_amount = :ticketAmount, registration_date = :registrationDate where event_hsv_id = :eventHsvId")
                    .setParameter("adminId", event.getAdminId())
                    .setParameter("eventHsvId", event.getEventHsvId())
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
            LOGGER.warn(e.getMessage());
        }
        return List.of();
    }

    private void deleteForeignReferencesFromAttendance(Long foreignKeyValue) {
        try {
            entityManager.createNativeQuery("Delete from hm_attendance where event_hsv_id = :foreignKeyValue")
                    .setParameter("foreignKeyValue", foreignKeyValue)
                    .executeUpdate();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    //get an explicit event to get the ticket amount in WinnerServiceImpl
    public Event findEvent(long eventHsvID) {
        try {
            return (Event) entityManager.createNativeQuery(
                            "SELECT * FROM event_hsv WHERE event_hsv_id = :eventHsvId", Event.class)
                    .setParameter("eventHsvId", eventHsvID)
                    .getSingleResult();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
        return null;
    }

}
