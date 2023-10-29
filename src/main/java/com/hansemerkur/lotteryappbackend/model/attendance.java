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
    private Employee Employee;

    public Employee getUser() {
        return Employee;
    }

    public void sethm_user(Employee Employee) {
        this.Employee = Employee;
    }
        @Override
        public String toString() {
            return "attendance{" +
                    "id=" + id +
                    ", escortname='" + escortname + '\'' +
                    '}';

    }
}
