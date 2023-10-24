package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class attendance {

    @Id
    @GeneratedValue
    private long id;

    private String escortname;

    @ManyToOne
    private HMUser HMUser;

    public HMUser getUser() {
        return HMUser;
    }

    public void sethm_user(HMUser HMUser) {
        this.HMUser = HMUser;
    }
        @Override
        public String toString() {
            return "attendance{" +
                    "id=" + id +
                    ", escortname='" + escortname + '\'' +
                    '}';

    }
}
