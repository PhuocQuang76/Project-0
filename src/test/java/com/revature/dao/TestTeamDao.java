package com.revature.dao;

import com.revature.daos.EmployeeDao;
import com.revature.daos.EmployeeDaoImpl;
import com.revature.daos.TeamDao;
import com.revature.daos.TeamDaoImpl;
import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;
import com.revature.models.Employee;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestTeamDao {
    @Test
    public void testGetAllTeam() {
        TeamDao teamDao = new TeamDaoImpl();
        Set<String> listTeam = teamDao.getTeam();

        //return listTeam;
    }

    @Test
    public void testGetTeamMember(){

        TeamDao teamDao = new TeamDaoImpl();
        List<String> team = teamDao.getTeamMemberFromId(1);
        //return team;
    }
}
