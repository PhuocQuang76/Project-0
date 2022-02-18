package com.revature.dao;

import com.revature.daos.EmployeeDao;
import com.revature.daos.EmployeeDaoImpl;
import com.revature.helpers.Address;
import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;
import com.revature.models.Employee;

import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.Date;

public class TestEmployeeDao {
    @Test
    public void testEmployeeInsert() {
        EmployeeDao eDao = new EmployeeDaoImpl();
        Employee e = new Employee();
        e.setPositionId(1);
        e.setSsn(1234567890);
        e.setFirstName("FName1");
        e.setLastName("LName1");

        e.setGender("Female");
        e.setDob(new Date());
        e.setEmail("");
        e.setPhoneNumber("8189994444");
        e.setWorkPlace(WorkPlace.REMOTE);
        e.setStartDate(new Date());
        e.setStatus(Status.ACTIVE);
        e.setPassWord("abc");

        Address ad = new Address();
        ad.setStreetNumber(1);
        ad.setStreetName1("a1");
        ad.setStreetName2("a1");
        ad.setCity("a1");
        ad.setState("a1");
        ad.setPostCode(1);

        try {
            boolean r = eDao.createNewEmployee(1, e,ad);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
