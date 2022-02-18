package com.revature.dto;

import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;

import java.util.Date;

public class EmployeeUpdateDTO {
    private int id;
    private int positionId;
    private WorkPlace workPlace;
    private Date endDate;
    private Status status;
    private String passWord;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPositionId() {
        return positionId;
    }

    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Status getStatus() {
        return status;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
