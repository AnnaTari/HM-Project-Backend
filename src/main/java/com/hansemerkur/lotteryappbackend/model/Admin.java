package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.*;

//Admin object ready for storage in H2
@Entity
public class Admin {

    //Admin_id automatically generated
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

    public Long getAdmin_id() {
        return adminId;
    }

    public String getAdminname() {
        return adminName;
    }

    public String getPassword() {
        return adminPassword;
    }

    public void setAdmin_id(Long admin_id) {
        this.adminId = admin_id;
    }

    public void setAdminname(String adminname) {
        this.adminName = adminname;
    }

    public void setPassword(String password) {
        this.adminPassword = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + adminId +
                ", adminname='" + adminName + '\'' +
                ", password='" + adminPassword + '\'' +
                '}';
    }
}
