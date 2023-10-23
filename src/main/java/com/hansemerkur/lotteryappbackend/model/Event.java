package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity //makes object ready for storage
public class Event {
    @Id
    @GeneratedValue
    private Long event_hsv_id;

    private String match_name;

    private Date event_date;

    public Event () {

    }
    public Event(String match_name, Date event_date) {
        this.match_name = match_name;
        this.event_date = event_date;
    }

    public Long getEvent_hsv_id() {
        return event_hsv_id;
    }

    public String getMatch_name() {
        return match_name;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_hsv_id(Long event_hsv_id) {
        this.event_hsv_id = event_hsv_id;
    }

    public void setMatch_name(String match_name) {
        this.match_name = match_name;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    @Override
    public String toString() {
        return "Event {" + "event_hsv_id=" + this.event_hsv_id + ", match_name='" + this.match_name + '\'' + ", event_date='" + this.event_date + '\'' + '}';
    }
}

