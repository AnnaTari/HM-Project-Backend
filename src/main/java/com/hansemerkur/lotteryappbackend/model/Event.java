package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Blob;
import java.sql.Time;
import java.util.Arrays;
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

    public Event(Long eventHsvId, String matchName, String matchDetails, Date eventDate, Time eventTime, String location, byte[] picture, Date deadline, Integer ticketType, Integer ticketAmount, Date registrationDate) {
        this.eventHsvId = eventHsvId;
        this.matchName = matchName;
        this.matchDetails = matchDetails;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.location = location;
        this.picture = picture;
        this.deadline = deadline;
        this.ticketType = ticketType;
        this.ticketAmount = ticketAmount;
        this.registrationDate = registrationDate;
    }

    public Long getEventHsvId() {
        return eventHsvId;
    }

    public String getMatchName() {
        return matchName;
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

    public void setEventHsvId(Long eventHsvId) {
        this.eventHsvId = eventHsvId;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }


    public void setMatchDetails(String matchDetails) {
        this.matchDetails = matchDetails;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventTime(Time eventTime) {
        this.eventTime = eventTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

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
        return "Event{" +
                "eventHsvId=" + eventHsvId +
                ", matchName='" + matchName + '\'' +
                ", matchDetails='" + matchDetails + '\'' +
                ", eventDate=" + eventDate +
                ", eventTime=" + eventTime +
                ", location='" + location + '\'' +
                ", picture=" + Arrays.toString(picture) +
                ", deadline=" + deadline +
                ", ticketType=" + ticketType +
                ", ticketAmount=" + ticketAmount +
                ", registrationDate=" + registrationDate +
                '}';
    }
}

