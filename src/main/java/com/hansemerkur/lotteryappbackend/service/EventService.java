
package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Event;

import java.util.List;

public interface EventService {

    List<Event> findAllEvents();

    List<Event> addEvent(Event event);

    List<Event> deleteEvent(Event event);

    List<Event> updateEvent(Event event);
}