package com.revature.models;

import com.revature.helpers.Address;
import com.revature.helpers.AddressType;
import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;

public class Personnel {
    private int id;
    private int positionId;
    private int ssn;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dob;
    private String email;
    private String phoneNumber;
    private WorkPlace workPlace;
    private Date startDate;
    private Date endDate;
    private Status status;
    private String passWord;

    public Personnel(){
    }
    public Personnel(int id, int positionId,int ssn,String firstName, String lastName,Address addresses, String gender,
                     Date dob, String email, String phoneNumber, WorkPlace workPlace, Date startDate, Date endDate, Status status) {
        this.id = id;
        this.positionId = positionId;
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.workPlace = workPlace;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;

    }
    public int getId() {
        return id;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
