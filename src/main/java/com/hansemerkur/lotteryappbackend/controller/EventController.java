package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/events")
//Receives requests from Angular
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping()
    public List<Event> findAllEvents() {
        return eventService.findAllEvents();
        // return Arrays.asList("HSV33", "St Pauli");
    }

    @PostMapping("/addEvent")
    public List<Event> addEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }


    @PostMapping("/deleteEvent")
    public List<Event> deleteEvent(@RequestBody Event event) {
        System.out.println(event);
        return eventService.deleteEvent(event);
    }

}
