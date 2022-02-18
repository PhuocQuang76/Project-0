package com.revature.Controllers;

import com.revature.services.TeamService;

import io.javalin.http.Context;

import java.util.List;
import java.util.Set;

public class TeamController {

    private final TeamService teamService = new TeamService();

    public void handleGetAllTeam(Context ctx){
        Set<String> teamName = teamService.getTeamName();
        ctx.json(teamName);
    }

    public void handleGetMemberOfParticularTeam(Context ctx){
        String idParam = ctx.pathParam("id");
        int id = Integer.parseInt(idParam);
        List<String> teamName = teamService.getTeamMember(id);
        // return a 404 if not found
        ctx.json(teamName);
    }

}
