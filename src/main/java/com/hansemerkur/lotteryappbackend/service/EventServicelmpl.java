package com.hansemerkur.lotteryappbackend.service;

//import com.hansemerkur.lotteryappbackend.model.Admin;
import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.repository.AdminRepository;
import com.hansemerkur.lotteryappbackend.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServicelmpl implements EventService {

    private final EventRepository eventRepository;

    public EventServicelmpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List <Event> findAllEvents() { return eventRepository.findAllEvents(); }

}