package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping

//Receives requests from Angular
public class EventController {

    private EventService eventService;
    public EventController(EventService eventService) {this.eventService = eventService;}

    @GetMapping("/events")
    public List<String> findAllEvents() {
       // return eventService.findAllEvents();
        //...
        return Arrays.asList("HSV", "St Pauli");
    }

    //@GetMapping
}
