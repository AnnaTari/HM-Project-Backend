package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;

//map Event as Entity containing relevant attributes
@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long eventHsvId;

    private int adminId;

    private String matchName;
    private String matchDetails;

    private Date eventDate;
    private String location;
    private byte[] picture;
    private Date deadline;
    private Integer ticketType;
    private Integer ticketAmount;
    private Date registrationDate;

    public Event() {

    }

    //store information of attributes
    public Event(Long eventHsvId, int adminId, String matchName, String matchDetails, Date eventDate, String location, byte[] picture, Date deadline, Integer ticketType, Integer ticketAmount, Date registrationDate) {
        this.eventHsvId = eventHsvId;
        this.adminId = adminId;
        this.matchName = matchName;
        this.matchDetails = matchDetails;
        this.eventDate = eventDate;
        this.location = location;
        this.picture = picture;
        this.deadline = deadline;
        this.ticketType = ticketType;
        this.ticketAmount = ticketAmount;
        this.registrationDate = registrationDate;
    }

    //define getter and setter
    public Long getEventHsvId() {
        return eventHsvId;
    }

    public void setEventHsvId(Long eventHsvId) {
        this.eventHsvId = eventHsvId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchDetails() {
        return matchDetails;
    }

    public void setMatchDetails(String matchDetails) {
        this.matchDetails = matchDetails;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Integer getTicketType() {
        return ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(Integer ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    //return string representation
    @Override
    public String toString() {
        return "Event{" +
                "eventHsvId=" + eventHsvId +
                ", adminId=" + adminId +
                ", matchName='" + matchName + '\'' +
                ", matchDetails='" + matchDetails + '\'' +
                ", eventDate=" + eventDate +
                ", location='" + location + '\'' +
                ", picture=" + Arrays.toString(picture) +
                ", deadline=" + deadline +
                ", ticketType=" + ticketType +
                ", ticketAmount=" + ticketAmount +
                ", registrationDate=" + registrationDate +
                '}';
    }
}

