package com.hansemerkur.lotteryappbackend.dto;
import com.hansemerkur.lotteryappbackend.model.Employee;

// neccesary data from h2 db for registration
public class RegistrationDto {

    private Employee employee;

    private int eventHsvId;

    private String escortName;

    private Boolean winner;

    private Boolean substituteWinner;

    // constructor
    public RegistrationDto (Employee employee, int eventHsvId, String escortName, Boolean winner, Boolean substituteWinner){
        this.employee = employee;
        this.eventHsvId = eventHsvId;
        this.escortName = escortName;
        this.winner = winner;
        this.substituteWinner = substituteWinner;
    }


    // getter and setter
    public Employee getEmployee(){return employee;}

    public int getEventHsvId(){return eventHsvId;}
    public String getEscortName(){return escortName;}

    public Boolean getWinner(){return winner;}
    public Boolean getSubstituteWinner(){return substituteWinner;}


    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEventHsvId(int eventHsvId) {
        this.eventHsvId = eventHsvId;
    }

    public void setEscortName(String escortName) {
        this.escortName = escortName;
    }

    public void setWinner(Boolean winner) {
        this.winner = winner;
    }

    public void setSubstituteWinner(Boolean substituteWinner) {
        this.substituteWinner = substituteWinner;
    }

    @Override
    public String toString() {
        return "RegistrationDto{" +
                "employee=" + employee +
                ", eventHsvId=" + eventHsvId +
                ", escortName='" + escortName + '\'' +
                ", winner=" + winner +
                ", substituteWinner=" + substituteWinner +
                '}';
    }
}
