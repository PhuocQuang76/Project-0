package com.revature.ui;

import com.revature.helpers.*;
import com.revature.models.Employee;
import com.revature.services.EmployeeService;
import com.revature.helpers.ScannerInputHelper;

public class EmployeeUI {

    private static EmployeeService employeeService;

    public static void setEmployeeService(EmployeeService employeeService) {
        EmployeeUI.employeeService = employeeService;
    }

    public static Employee createNewEmployee() {
        Employee newEmployee = new Employee();
       // newEmployee = (Employee) PersonnelUI.createNewMember(newEmployee);

//        newEmployee.setFirstName(personnel.getFirstName());
//        newEmployee.setLastName(personnel.getLastName());
//        newEmployee.setAddresses(personnel.getAddresses());
//        newEmployee.setAddresses(new HashMap(){{
//                put(AddressType.MAIL, addressHelper.mailAddressHandle());
//            }});
//            newEmployee.setAddresses(new HashMap(){{
//                put(AddressType.OFFICE, addressHelper.officeAddressHandle());
//            }});
//        newEmployee.setGender(personnel.getGender());
//        newEmployee.setDob(personnel.getDob());
//        newEmployee.setEmail(personnel.getEmail());
//        newEmployee.setPhoneNumber(personnel.getPhoneNumber());
//        newEmployee.setWorkPlace(personnel.getWorkPlace());
//        newEmployee.setStartDate(personnel.getStartDate());

        System.out.println("Enter tittle: ");
        EmployeeTittle inputTittle = (EmployeeTittle.valueOf(ScannerInputHelper.collectStringInput().toUpperCase()));
        while (inputTittle != EmployeeTittle.INTERN || inputTittle != EmployeeTittle.HA ||
                inputTittle != EmployeeTittle.PAJUNIOR || inputTittle != EmployeeTittle.PALEVEL1 ||
                inputTittle != EmployeeTittle.PALEVEL2 || inputTittle != EmployeeTittle.PALEVEL3 ||
                inputTittle != EmployeeTittle.PALEVEL4 || inputTittle != EmployeeTittle.HA) {
            inputTittle = (EmployeeTittle.valueOf(ScannerInputHelper.collectStringInput().toUpperCase()));
        }
        newEmployee.setTittle(inputTittle);
        String teamName = "test1";
        //employeeService.createNewEmployee(teamName, newEmployee);
        return newEmployee;
    }
}
