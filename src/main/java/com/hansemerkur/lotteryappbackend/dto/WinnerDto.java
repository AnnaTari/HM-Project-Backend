package com.hansemerkur.lotteryappbackend.dto;

//structure data from different tables in H2 which are necessary for the Lottery Process
public class WinnerDto {
    private int employeeId;
    private int eventHsvId;
    private int blacklistId;
    private String name;
    private String email;
    private String escortName;
    private boolean winner;
    private boolean substituteWinner;
    private int blacklistCounter;

    //constructor
    public WinnerDto(int employeeId, int eventHsvId, int blacklistId, String name, String email, String escortName, boolean winner, boolean substituteWinner, int blacklistCounter) {
        this.employeeId = employeeId;
        this.eventHsvId = eventHsvId;
        this.blacklistId = blacklistId;
        this.name = name;
        this.email = email;
        this.escortName = escortName;
        this.winner = winner;
        this.substituteWinner = substituteWinner;
        this.blacklistCounter = blacklistCounter;
    }

    //getter and setter
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
