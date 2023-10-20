package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//Admin object ready for storage in H2
@Entity
public class Admin {

    //Admin_id automatically generated
    @Id
    @GeneratedValue
    private Long admin_id;

    private String adminname;

    private String password;

    public Admin() {

    }

    public Admin(String adminname, String password) {
        this.adminname = adminname;
        this.password = password;
    }

    public Long getAdmin_id() {
        return admin_id;
    }

    public String getAdminname() {
        return adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setAdmin_id(Long admin_id) {
        this.admin_id = admin_id;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
