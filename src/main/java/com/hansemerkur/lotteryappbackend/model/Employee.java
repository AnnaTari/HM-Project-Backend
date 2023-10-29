package com.hansemerkur.lotteryappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

    //hm_user_id automatically generated
    @Id
    @GeneratedValue
    private long employeeId;

    private String employeeName;
    private String employeeEmail;


    public Employee() {

    }

    public Employee(String employeeName, String employeeEmail) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }

    public long getEmployeeId() {return employeeId;}

    public String getEmployeeName() {return employeeName;}

    public String getEmployeeEmail() {return employeeEmail;}

    public void setEmployeeId(long employee_id) {this.employeeId = employee_id;}

    public void setEmployeeName(String employeename) {this.employeeName = employeename;}

    public void setEmployeeEmail(String employeeemail) {this.employeeEmail = employeeemail;}

    @Override
    public String toString() {
        return "Employee{" +
                    "employee_id=" + employeeId +
                ", employeename='" + employeeName + '\'' +
                ", employeeemail='" + employeeEmail + '\'' +
                '}';
    }
}
