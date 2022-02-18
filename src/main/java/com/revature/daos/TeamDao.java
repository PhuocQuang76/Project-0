package com.revature.daos;

import com.revature.models.Team;

import java.util.List;
import java.util.Set;

public interface TeamDao {
    //Team getTeam(int teamId);

    Set<String> getTeam();
    List<String> getTeamMemberFromId(int teamId);


    //boolean addTeam(Team team);
}
