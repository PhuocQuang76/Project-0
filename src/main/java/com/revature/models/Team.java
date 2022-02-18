package com.revature.models;

import java.util.HashSet;
import java.util.Set;

public class Team {
    private Manager manager;
    private Set<Employee> members;
    private String teamName;

    //Return a HashSet so, member can not be modified by anyone.
    public Team() {
        members = new HashSet<>();
    }

    //Methods
    public void addMember(Employee employee) {
        members.add(employee);
    }

    public void removeMember(Employee employee) {
        members.remove(employee);
    }

    //Getter and setter
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Set<Employee> getMembers() {
        return new HashSet<>(members);
    }
}
