package com.revature.services;

import com.revature.daos.TeamDao;
import com.revature.daos.TeamDaoImpl;
import com.revature.models.Team;

import java.util.List;
import java.util.Set;

public class TeamService {
    TeamDao teamDao = new TeamDaoImpl();

    public Set<String> getTeamName() {
        return teamDao.getTeam();
    }

    public List<String> getTeamMember(int teamId) {
        return teamDao.getTeamMemberFromId(teamId);
    }


}

