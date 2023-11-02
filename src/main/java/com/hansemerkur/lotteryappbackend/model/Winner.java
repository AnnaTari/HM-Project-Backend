package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Winner {
    @Id
    @GeneratedValue
    private long blacklistId;
    private int userId;
    private int eventHsvId;
    private String name;
    private String email;
    private String escortName;
    private boolean winner;
    private boolean substituteWinner;

    public Winner () {

    }

    //... define getter and setter, Override...


}
