package com.revature.ui;

import com.revature.helpers.ManagerTittle;
import com.revature.models.Manager;
import com.revature.helpers.ScannerInputHelper;

public class ManagerUI {

    public static Manager createNewManager() {

        Manager newManager = new Manager();
//        Personnel personnel = PersonnelUI.createNewMember();
//
//        newManager.setFirstName(personnel.getFirstName());
//        newManager.setLastName(personnel.getLastName());
//        newManager.setAddresses(personnel.getAddresses());



//        newEmployee.setAddresses(new HashMap(){{
//                put(AddressType.MAIL, addressHelper.mailAddressHandle());
//            }});
//            newEmployee.setAddresses(new HashMap(){{
//                put(AddressType.OFFICE, addressHelper.officeAddressHandle());
//            }});


//        newManager.setGender(personnel.getGender());
//        newManager.setDob(personnel.getDob());
//        newManager.setEmail(personnel.getEmail());
//        newManager.setPhoneNumber(personnel.getPhoneNumber());
//        newManager.setWorkPlace(personnel.getWorkPlace());
//        newManager.setStartDate(personnel.getStartDate());

        System.out.println("Enter tittle: ");
        ManagerTittle inputTittle = (ManagerTittle.valueOf(ScannerInputHelper.collectStringInput().toUpperCase()));
        while (inputTittle != ManagerTittle.MANAGERLEVEL1 || inputTittle != ManagerTittle.MANAGERLEVEL2){
            inputTittle = (ManagerTittle.valueOf(ScannerInputHelper.collectStringInput().toUpperCase()));
        }
        newManager.setTittle(inputTittle);

        return newManager;
    }
}
