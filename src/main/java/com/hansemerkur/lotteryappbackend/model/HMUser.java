package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class HMUser {

    //hm_user_id automatically generated
    @Id
    @GeneratedValue
    private long hm_user_id;

    private String name;
    private String email;


    public HMUser() {

    }

    public HMUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public long getHm_user_id() {return hm_user_id;}

    public String getName() {return name;}

    public String getEmail() {return email;}

    public void setHm_user_id(long hm_user_id) {this.hm_user_id = hm_user_id;}

    public void setName(String name) {this.name = name;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "hm_user{" +
                "hm_user_id=" + hm_user_id +
                ", username='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
