package com.revature.helpers;

import com.revature.helpers.ScannerInputHelper;

public class ValidateHelper extends Object{
    public static String emailAddressHandle(){
        String emailAddress = ScannerInputHelper.collectStringInput();
        boolean validateEmail = isEmailvalidity(emailAddress);
        if(!validateEmail){
            System.out.println("Invalid email Address, please enter again: ");
            emailAddressHandle();
        }
        return emailAddress;
    }

    public static boolean isEmailvalidity(String emailaddress){
        String email_regex = "[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.){2}\b?.[a-zA-Z]+";
        boolean b = emailaddress.matches(email_regex);
        return b;
    }

    private static boolean isPhoneNumberValid(String s) {
        String regex = "\\d{3}-\\d{3}-\\d{4}"; // XXX-XXX-XXXX
        boolean b = s.matches(regex);
        return b;
    }

    public static String phoneNumberHandle(){
        String phoneNumber = ScannerInputHelper.collectStringInput();
        boolean validatePhoneNumber = isPhoneNumberValid(phoneNumber);
        if(!validatePhoneNumber){
            System.out.println("Invalid phone number, please enter again: ");
            phoneNumberHandle();
        }
        return phoneNumber;
    }
}
