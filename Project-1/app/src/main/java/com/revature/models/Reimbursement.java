package com.revature.models;


import java.sql.Date;

public class Reimbursement {
    private int reimbursementId;
    private int userId;
    private int managerId;
    private String title;
    private String description;
    private int status;
    private Date createdDate;

    public Reimbursement(){};

    public Reimbursement(int reimbursementId, int userId, int managerId, String tittle, String description, int status, Date createdDate){
        this.reimbursementId = reimbursementId;
        this.userId = userId;
        this.managerId = managerId;
        this.title = tittle;
        this.description = description;
        this.status = status;
        this.createdDate = createdDate;
    }


    public int getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(int reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getUserID() {
        return userId;
    }

    public void setUserID(int userId) {
        this.userId = userId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerID(int managerId) {
        this.managerId = managerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
