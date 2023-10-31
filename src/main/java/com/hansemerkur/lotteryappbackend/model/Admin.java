package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.*;

//Admin object ready for storage in H2
@Entity
public class Admin {

    //AdminId automatically generated
    @Id
    @GeneratedValue
    private Long adminId;
    private String adminName;

    private String adminPassword;

    public Admin() {

    }

    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public Long getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getPassword() {
        return adminPassword;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}
