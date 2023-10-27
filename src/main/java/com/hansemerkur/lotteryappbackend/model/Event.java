package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;

@Entity //represents record we want to retrieve from the database
public class Event {
    @Id
    @GeneratedValue
    private Long eventHsvId;

    private String matchName;

    private Date eventDate;

    public Event () {

    }
    public Event(String match_name, Date event_date) {
        this.matchName = match_name;
        this.eventDate = event_date;
    }

    public Long getEvent_hsv_id() {
        return eventHsvId;
    }

    public String getMatch_name() {
        return matchName;
    }

    public Date getEvent_date() {
        return eventDate;
    }

    public void setEvent_hsv_id(Long event_hsv_id) {
        this.eventHsvId = event_hsv_id;
    }

    public void setMatch_name(String match_name) {
        this.matchName = match_name;
    }

    public void setEvent_date(Date event_date) {
        this.eventDate = event_date;
    }

    @Override
    public String toString() {
        return "Event {" + "event_hsv_id=" + this.eventHsvId + ", match_name='" + this.matchName + '\'' + ", event_date='" + this.eventDate + '\'' + '}';
    }
}

