package com.revature.dto;

import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;

import java.util.Date;

public class PositionDTO {
    private int id;
    private int min_salary;
    private int max_salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMin_salary() {
        return min_salary;
    }

    public int getMax_salary() {
        return max_salary;
    }
}
