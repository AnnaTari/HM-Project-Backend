package com.hansemerkur.lotteryappbackend.controller;

import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Time;
import java.util.List;

//Accepts only requests from this origin (frontend) for the endpoint events
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/events")
public class EventController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventController.class);

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    //gets all Events for the endpoint events
    @GetMapping()
    public List<Event> findAllEvents() {
        return eventService.findAllEvents();
    }

    //adds an event into the database for the endpoint events/addEvent
    @PostMapping(value = "/addEvent", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public List<Event> addEvent(@RequestPart("event") Event event, @RequestPart("picture") MultipartFile picture) throws IOException {
        //needs to receive the picture separately from the event as a MultipartFile to get its bytes
        byte[] pictureBytes = picture.getBytes();
        event.setPicture(pictureBytes);
        LOGGER.info(String.valueOf(event.getEventDate()));
        return eventService.addEvent(event);
    }

    //updates an already existing event in the database for the endpoint events/updateEvent
    @PostMapping(value = "/updateEvent", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public List<Event> updateEvent(@RequestPart("event") Event event, @RequestPart("picture") MultipartFile picture) throws IOException {
        //needs to receive the picture separately from the event as a MultipartFile to get its bytes
        byte[] pictureBytes = picture.getBytes();
        event.setPicture(pictureBytes);
        return eventService.updateEvent(event);
    }


    //deletes an event from the database for the endpoint events/deleteEvent
    @PostMapping("/deleteEvent")
    public List<Event> deleteEvent(@RequestBody Event event) {
        LOGGER.info(String.valueOf(event));
        return eventService.deleteEvent(event);
    }
}
