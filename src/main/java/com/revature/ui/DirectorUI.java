package com.revature.ui;

import com.revature.helpers.DirectorTittle;
import com.revature.models.Director;
import com.revature.helpers.ScannerInputHelper;

public class DirectorUI {

    public static Director createNewDirector() {
        Director newDirector = new Director();
//        Personnel personnel = PersonnelUI.createNewMember();
//
//        newDirector.setFirstName(personnel.getFirstName());
//        newDirector.setLastName(personnel.getLastName());
//        newDirector.setAddresses(personnel.getAddresses());



//        newEmployee.setAddresses(new HashMap(){{
//                put(AddressType.MAIL, addressHelper.mailAddressHandle());
//            }});
//            newEmployee.setAddresses(new HashMap(){{
//                put(AddressType.OFFICE, addressHelper.officeAddressHandle());
//            }});



//        newDirector.setGender(personnel.getGender());
//        newDirector.setDob(personnel.getDob());
//        newDirector.setEmail(personnel.getEmail());
//        newDirector.setPhoneNumber(personnel.getPhoneNumber());
//        newDirector.setWorkPlace(personnel.getWorkPlace());
//        newDirector.setStartDate(personnel.getStartDate());

        System.out.println("Enter tittle: ");
        DirectorTittle inputTittle = (DirectorTittle.valueOf(ScannerInputHelper.collectStringInput().toUpperCase()));
        while (inputTittle != DirectorTittle.DIRECTORLEVEL1 || inputTittle != DirectorTittle.DIRECTORLEVEL2) {
            inputTittle = (DirectorTittle.valueOf(ScannerInputHelper.collectStringInput().toUpperCase()));
        }
       // newDirector.setTittle(inputTittle);

        return newDirector;

    }
}
