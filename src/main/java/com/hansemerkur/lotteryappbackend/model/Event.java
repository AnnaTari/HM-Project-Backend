package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

@Entity //represents record we want to retrieve from the database
public class Event {
    @Id
    @GeneratedValue
    private Long eventHsvId;

    private String matchName;
    private String matchDetails;

    private Date eventDate;
    private Time eventTime;
    private String location;
    private byte[] picture;
    private Date deadline;
    private Integer ticketType;
    private Integer ticketAmount;
    private Date registrationDate;


    public Event() {

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

    public Date getEventDate() {
        return eventDate;
    }

    public Time getEventTime() {
        return eventTime;
    }

    public String getLocation() {
        return location;
    }

    public byte[] getPicture() {
        return picture;
    }

    public Date getDeadline() {
        return deadline;
    }

    public Integer getTicketType() {
        return ticketType;
    }

    public Integer getTicketAmount() {
        return ticketAmount;
    }

    public Date getRegistrationDate() {
        return registrationDate;
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

    public void setMatchDetails(String matchDetails) {this.matchDetails = matchDetails;}

    public void setEventDate(Date eventDate) {this.eventDate = eventDate;}

    public void setEventTime(Time eventTime) {this.eventTime = eventTime;}

    public void setLocation(String location) {this.location = location;}

    public void setPicture(byte[] picture) {this.picture = picture;}

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public void setTicketAmount(Integer ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Event {" + "event_hsv_id=" + this.eventHsvId + ", match_name='" + this.matchName + '\'' + ", event_date='" + this.eventDate + '\'' + '}';
    }
}

