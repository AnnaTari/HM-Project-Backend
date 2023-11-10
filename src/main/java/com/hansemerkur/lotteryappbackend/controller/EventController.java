package com.hansemerkur.lotteryappbackend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.repository.AdminRepository;
import com.hansemerkur.lotteryappbackend.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/events")
//Receives Event requests from Angular
public class EventController {

    private static final Logger log = LoggerFactory.getLogger(AdminRepository.class);

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping()
    public List<Event> findAllEvents() {
        return eventService.findAllEvents();
    }

    @PostMapping(value = "/addEvent", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public List<Event> addEvent(@RequestPart("event") String eventString, @RequestPart("picture") MultipartFile picture) throws IOException {
        log.info(eventString);
        ObjectMapper mapper = new ObjectMapper();
        Event event = mapper.readValue(eventString, Event.class);
        byte[] pictureBytes = picture.getBytes();
        event.setPicture(pictureBytes);
        log.info(String.valueOf(event));
        return eventService.addEvent(event);
    }

    @PostMapping(value = "/updateEvent")
    public List<Event> updateEvent(@RequestBody Event event) {
        return eventService.updateEvent(event);
    }


    @PostMapping("/deleteEvent")
    public List<Event> deleteEvent(@RequestBody Event event) {
        log.info(String.valueOf(event));
        return eventService.deleteEvent(event);
    }

}
