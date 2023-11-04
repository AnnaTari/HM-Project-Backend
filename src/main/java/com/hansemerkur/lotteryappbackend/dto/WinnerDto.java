package com.hansemerkur.lotteryappbackend.dto;

public class WinnerDto {
    private String userId;
    private String eventHsvId;
    private String blacklistId;
    private String name;
    private String email;
    private String escortName;
    private String winner;
    private String substituteWinner;
    private String blacklistCounter;

    public WinnerDto(String userId, String eventHsvId, String blacklistId, String name, String email, String escortName, String winner, String substituteWinner, String blacklistCounter) {
        this.userId = userId;
        this.eventHsvId = eventHsvId;
        this.blacklistId = blacklistId;
        this.name = name;
        this.email = email;
        this.escortName = escortName;
        this.winner = winner;
        this.substituteWinner = substituteWinner;
        this.blacklistCounter = blacklistCounter;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
