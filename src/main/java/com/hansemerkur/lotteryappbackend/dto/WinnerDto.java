package com.hansemerkur.lotteryappbackend.dto;

public class WinnerDto {
    private String employee_id;
    private String eventHsvId;
    private String blacklistId;
    private String name;
    private String email;
    private String escortName;
    private String winner;
    private String substituteWinner;
    private String blacklistCounter;

    public WinnerDto(String employee_id, String eventHsvId, String blacklistId, String name, String email, String escortName, String winner, String substituteWinner, String blacklistCounter) {
        this.employee_id = employee_id;
        this.eventHsvId = eventHsvId;
        this.blacklistId = blacklistId;
        this.name = name;
        this.email = email;
        this.escortName = escortName;
        this.winner = winner;
        this.substituteWinner = substituteWinner;
        this.blacklistCounter = blacklistCounter;
    }

    public String getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEventHsvId() {
        return eventHsvId;
    }

    public void setEventHsvId(String eventHsvId) {
        this.eventHsvId = eventHsvId;
    }

    public String getBlacklistId() {
        return blacklistId;
    }

    public void setBlacklistId(String blacklistId) {
        this.blacklistId = blacklistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEscortName() {
        return escortName;
    }

    public void setEscortName(String escortName) {
        this.escortName = escortName;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getSubstituteWinner() {
        return substituteWinner;
    }

    public void setSubstituteWinner(String substituteWinner) {
        this.substituteWinner = substituteWinner;
    }

    public String getBlacklistCounter() {
        return blacklistCounter;
    }

    public void setBlacklistCounter(String blacklistCounter) {
        this.blacklistCounter = blacklistCounter;
    }
}
