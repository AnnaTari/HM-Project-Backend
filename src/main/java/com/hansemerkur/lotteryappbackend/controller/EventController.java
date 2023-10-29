package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.service.EventService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/events")

//Receives requests from Angular
public class EventController {

    private EventService eventService;
    public EventController(EventService eventService) {this.eventService = eventService;}

    @GetMapping()
    public List<Event> findAllEvents() {
        return eventService.findAllEvents();

        // return Arrays.asList("HSV33", "St Pauli");
    }

    //@GetMapping
}
