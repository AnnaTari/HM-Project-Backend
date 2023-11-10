package com.hansemerkur.lotteryappbackend.model;

public class Winner {

    private long blacklistId;
    private int employee_id;
    private int eventHsvId;
    private String name;
    private String email;
    private String escortName;
    private boolean winner;
    private boolean substituteWinner;
    private int blacklistCounter;

    public Winner () {

    }

    //Constructor
    public Winner(long blacklistId, int employee_id, int eventHsvId, String name, String email, String escortName, boolean winner, boolean substituteWinner, int blacklistCounter) {
        this.blacklistId = blacklistId;
        this.employee_id = employee_id;
        this.eventHsvId = eventHsvId;
        this.name = name;
        this.email = email;
        this.escortName = escortName;
        this.winner = winner;
        this.substituteWinner = substituteWinner;
        this.blacklistCounter = blacklistCounter;
    }

    public long getBlacklistId() {
        return blacklistId;
    }

    public void setBlacklistId(long blacklistId) {
        this.blacklistId = blacklistId;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int userId) {
        this.employee_id = employee_id;
    }

    public int getEventHsvId() {
        return eventHsvId;
    }

    public void setEventHsvId(int eventHsvId) {
        this.eventHsvId = eventHsvId;
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

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean isSubstituteWinner() {
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


    @Override
    public String toString() {
        return "Winner{" +
                "blacklistId=" + blacklistId +
                ", employee_id=" + employee_id +
                ", eventHsvId=" + eventHsvId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", escortName='" + escortName + '\'' +
                ", winner=" + winner +
                ", substituteWinner=" + substituteWinner +
                ", blacklistCounter=" + blacklistCounter +
                '}';
    }
}
