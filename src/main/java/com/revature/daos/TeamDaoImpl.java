package com.revature.daos;

import com.revature.helpers.DB.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TeamDaoImpl implements TeamDao {
    private Set<String> teamName;
    private List<String> teamMember;

    @Override
    public Set<String> getTeam() {
        String sql = "Select * from team";
//        teamName = new ArrayList<>();
        try (Connection c = ConnectionDb.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //team = new HashSet<>();
                String name = rs.getString("team_name");
                teamName.add(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teamName;
    }

    @Override
    public List<String> getTeamMemberFromId(int teamId){
        String sql = "select firstname, lastname\n" +
                "from employee_team\n" +
                "join employee\n" +
                "on employee.id = employee_team.employee_id\n" +
                "where \n" +
                "employee_team.team_id  = ? ";
        teamMember = new ArrayList<>();

        try (Connection c = ConnectionDb.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)){
            ps.setInt(1,teamId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //team = new HashSet<>();
                String first = rs.getString("firstName");
                String last = rs.getString("lastName");
                teamMember.add(first + " " + last);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teamMember;
    }



//    @Override
//    public boolean addTeam(Team team) {
//        System.out.println("Enter team name: ");
//        String scannerInputTeam = ScannerInputHelper.collectStringInput();
//        String sql = "Insert into team (teamName) values (scannerInputTeam)";
//        teams.put(team.getTeamName().toUpperCase(), team);
//        return true;
//    }


//    @Override
//    public Team getTeam(int teamId){
//        return team.get(teamId);
//    };


    public TeamDaoImpl() {
//        teams = new HashSet<>();
//        Team team = new Team();
//        team.setName("Test1");
//        teams.put(team.getName().toUpperCase(), team);
//        team = new Team();
//        team.setName("Test2");
//        teams.put(team.getName().toUpperCase(), team);
//        team = new Team();
//        team.setName("Test3");
//        teams.put(team.getName().toUpperCase(), team);
//        team = new Team();
//        team.setName("Test4");
//        teams.put(team.getName().toUpperCase(), team);
//        team = new Team();
//        team.setName("Test");
//        teams.put(team.getName().toUpperCase(), team);
    }


}
