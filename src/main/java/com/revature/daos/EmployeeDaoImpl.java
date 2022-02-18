package com.revature.daos;

import com.revature.helpers.Address;
import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;
import com.revature.helpers.DB.ConnectionDb;
import com.revature.models.Employee;

import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private String pattern = "yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    @Override
    public boolean createNewEmployee(int teamId,Employee employee,Address address) throws SQLException {
        String insertEmployee = "insert into employee(" +
                "position_id,ssn,firstname,lastname,gender,dob,email,phonenumber,workplace,startdate,status,password) " +
                "values (?,?,?,?,?,?,?,?,?,?,?,?) RETURNING id";
        String insertTeam = "insert into employee_team(employee_id,team_id) values (?,?)";
        String insertAddress = "insert into address(employee_id,street_number,streetName_1,streetName_2,city,state)" +
                "values (?,?,?,?,?,?)";
        // try with resources allows us to declare Autoclosable resources so that they are
        // automatically closed at the end of the try block
        Connection c = ConnectionDb.getConnection();
        c.setAutoCommit(false);
        try {
            PreparedStatement psNewEmployee = c.prepareStatement(insertEmployee);
            // set type as param for all indexes
            psNewEmployee.setInt(1, employee.getPositionId());
            psNewEmployee.setInt(2, employee.getSsn());
            psNewEmployee.setString(3, employee.getFirstName());
            psNewEmployee.setString(4, employee.getLastName());
            psNewEmployee.setString(5, employee.getGender());
            psNewEmployee.setDate(6, java.sql.Date.valueOf(simpleDateFormat.format(employee.getDob())));
            psNewEmployee.setString(7, employee.getEmail());
            psNewEmployee.setString(8, employee.getPhoneNumber());
            psNewEmployee.setInt(9, employee.getWorkPlace().ordinal());
            psNewEmployee.setDate(10, java.sql.Date.valueOf(simpleDateFormat.format(employee.getStartDate())));


            psNewEmployee.setInt(11, 0);
            psNewEmployee.setString(12, employee.getPassWord());

            ResultSet rs = psNewEmployee.executeQuery();

            int newId = 0;
            if (rs.next()) {
                newId = rs.getInt(1);
                System.out.println("New Id: " + newId);

                //Prepare another statement to add recored into employee_team table.
                //String insertTeam = "INSERT INTO EMPLOYEE_TEAM(EMPLOYEE_ID, TEAM_ID) VALUES (?, ?);";
                PreparedStatement psEmployeeTeam = c.prepareStatement(insertTeam);
                psEmployeeTeam.setInt(1,newId);
                psEmployeeTeam.setInt(2,teamId);
                psEmployeeTeam.execute();

                //Prepare another statement to add address for the new employee just add.
                PreparedStatement psEmployeeAddress = c.prepareStatement(insertAddress);
                psEmployeeAddress.setInt(1,newId);
                psEmployeeAddress.setInt(2,address.getStreetNumber());
                psEmployeeAddress.setString(3,address.getStreetName1());
                psEmployeeAddress.setString(4,address.getStreetName2());
                psEmployeeAddress.setString(5,address.getCity());
                psEmployeeAddress.setString(6,address.getState());
                //psEmployeeAddress.setInt(7,address.getPostCode());
                psEmployeeAddress.execute();
            }
            if (newId != 0) {
                c.commit();
                return true;
            } else {
                c.rollback();
                return false;
            }

        } finally {
            if (c != null && !c.isClosed())
                c.close();
        }
    }

    @Override
    public boolean updateEmployee(int id,int positionId,WorkPlace workPlace,Date endDate,Status status,String passWord){
        String updateEmployee = "update employee set position_id = ?, workplace = ?, " +
                "enddate= ?,status = ?,password = ? where id = ?";

        try(Connection con = ConnectionDb.getConnection()){
            PreparedStatement psUpdateEmployee = con.prepareStatement(updateEmployee);
            psUpdateEmployee.setInt(1,positionId);
            psUpdateEmployee.setInt(2,workPlace.ordinal());
            psUpdateEmployee.setDate(3,java.sql.Date.valueOf(simpleDateFormat.format(endDate)));

            if(endDate != null){
                psUpdateEmployee.setInt(4,1);
            }else{
                throw new NullPointerException();

            }
            //psUpdateEmployee.setInt(4,status.ordinal());
            psUpdateEmployee.setString(5, passWord);
            psUpdateEmployee.setInt(6,id);
            int rowsAffected = psUpdateEmployee.executeUpdate();

            if(rowsAffected==1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<String> getViewEmployeeSalary(int id){
        String sql= "select e.id, e.firstname , e.lastname, p.min_salary  , p.max_salary \n" +
                "from employee e\n" +
                "join position p\n" +
                "on e.position_id  = p.id\n" +
                "where e.id = ?;";
        List<String> employeeSalary = new ArrayList<>();
        String result;
        try(Connection con = ConnectionDb.getConnection()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()){

                int employeeID = rs.getInt("id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                int min_salary = rs.getInt("min_salary");
                int max_salary = rs.getInt("max_salary");

                result = "Id " + employeeID + ": ->  " + firstName + " " +
                        lastName+ ". Salary range from: " + "$"+ min_salary + " to "+ "$"+max_salary;

                employeeSalary.add(result);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return employeeSalary;
    }

    @Override
    public List<Employee> getAllEmployee(){
        List<Employee> employeeArrayList = new ArrayList<>();

        String getAllEmployee = "select id,firstname,lastname from employee order by id";

        try(Connection con = ConnectionDb.getConnection();
            Statement s = con.createStatement();){
            ResultSet rs = s.executeQuery(getAllEmployee);
//            PreparedStatement ps = con.prepareStatement(getAllEmployee)){
//            ps.setInt(1,1);
//
//            ResultSet rs = ps.executeQuery(getAllEmployee);

            while(rs.next()){
                Employee employee = new Employee();
                //Get id of current record and set it into current employee object
                int id = rs.getInt("id");
                employee.setId(id);

                //Get firstName of current record and set it into current employee object
                String firstname = rs.getString("firstname");
                employee.setFirstName(firstname);

                //Get firstName of current record and set it into current employee object
                String lastname = rs.getString("lastname");
                employee.setLastName(lastname);

                // add person to my arraylist
                employeeArrayList.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeArrayList;
    }



    public boolean updateEmployeeSalary(int id, int min_salary, int max_salary) {
        String sql = "update position\n" +
                "set min_salary = ?,\n" +
                "max_salary = ?\n" +
                "where id = ?";

        try (Connection con = ConnectionDb.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, min_salary);
            ps.setInt(2, max_salary);
            ps.setInt(3, id);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public String getEmployeeByUsernameAndPassword(String email, String passWord) throws Exception {
        String positionTypeName = "";
        String sql = "select *\n" +
                "from employee\n" +
                "where email = ? and password = ? ";

        String sql2 = "select position_name \n" +
                "from position\n" +
                "where id = ?";
        Connection c = ConnectionDb.getConnection();
        c.setAutoCommit(false);
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            // set type as param for all indexes
            ps.setString(1, email);
            ps.setString(2, passWord);

            ResultSet rs = ps.executeQuery();

            int newId = 0;
            int positionNameId = 0;
            if (rs.next()) {
                newId = rs.getInt(1);
                positionNameId = rs.getInt(2);

                //Statement 2
                PreparedStatement psEmployeeTypeName = c.prepareStatement(sql2);
                psEmployeeTypeName.setInt(1, positionNameId);
                ResultSet rs2 = psEmployeeTypeName.executeQuery();

                positionTypeName = rs2.getString("position_name");

            }
            if (newId != 0) {
                c.commit();
                return positionTypeName;
            } else {
                c.rollback();
                return "Fail";
            }

        } finally {
            if (c != null && !c.isClosed())
                c.close();
        }
    }
}
