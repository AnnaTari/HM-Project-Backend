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

    public Winner () {

    }

    //Constructor
    public Winner(long blacklistId, int userId, int eventHsvId, String name, String email, String escortName, boolean winner, boolean substituteWinner) {
        this.blacklistId = blacklistId;
        this.employee_id = employee_id;
        this.eventHsvId = eventHsvId;
        this.name = name;
        this.email = email;
        this.escortName = escortName;
        this.winner = winner;
        this.substituteWinner = substituteWinner;
    }

    public long getBlacklistId() {
        return blacklistId;
    }

    public void setBlacklistId(long blacklistId) {
        this.blacklistId = blacklistId;
    }

    public int getEmplyeeId() {
        return employee_id;
    }

    public void setEmplyeeId(int userId) {
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


    @Override
    public String toString() {
        return "Winner{" +
                "blacklistId=" + blacklistId +
                ", userId=" + employee_id +
                ", eventHsvId=" + eventHsvId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", escortName='" + escortName + '\'' +
                ", winner=" + winner +
                ", substituteWinner=" + substituteWinner +
                '}';
    }
}
