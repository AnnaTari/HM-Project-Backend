
package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> findAllEvents() {
        return eventRepository.findAllEvents();
    }

    @Override
    public List<Event> addEvent(Event event) {
        return eventRepository.addEvent(event);
    }

    @Override
    public List<Event> deleteEvent(Event event) {
        return eventRepository.deleteEvent(event);
    }

    @Override
    public List<Event> updateEvent(Event event) {
        return eventRepository.updateEvent(event);
    }
}