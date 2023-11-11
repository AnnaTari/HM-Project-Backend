package com.hansemerkur.lotteryappbackend.dto;

public class WinnerDto {
    private int employee_id;
    private int eventHsvId;
    private int blacklistId;
    private String name;
    private String email;
    private String escortName;
    private boolean winner;
    private boolean substituteWinner;
    private int blacklistCounter;

    public WinnerDto(int employee_id, int eventHsvId, int blacklistId, String name, String email, String escortName, boolean winner, boolean substituteWinner, int blacklistCounter) {
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

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getEventHsvId() {
        return eventHsvId;
    }

    public void setEventHsvId(int eventHsvId) {
        this.eventHsvId = eventHsvId;
    }

    public int getBlacklistId() {
        return blacklistId;
    }

    public void setBlacklistId(int blacklistId) {
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

    public boolean getWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean getSubstituteWinner() {
        return substituteWinner;
    }

    public void setSubstituteWinner(boolean substituteWinner) {
        this.substituteWinner = substituteWinner;
    }

    public int getBlacklistCounter() {
        return blacklistCounter;
    }

    public void setBlacklistCounter(int blacklistCounter) {
        this.blacklistCounter = blacklistCounter;
    }
}
