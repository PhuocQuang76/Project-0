package com.revature.ui;
import com.revature.helpers.Address;
import com.revature.helpers.AddressType;
import com.revature.helpers.Status;
import com.revature.helpers.WorkPlace;
import com.revature.models.Personnel;
import com.revature.models.Team;
import com.revature.helpers.AddressHelper;
import com.revature.helpers.ScannerInputHelper;
import com.revature.helpers.ValidateHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PersonnelUI {
    private int id;
    private int positionId;
    private int ssn;
    private String firstName;
    private String lastName;
    private Map<AddressType, Address> addresses;
    private String gender;
    private Date dob;
    private String email;
    private String phoneNumber;
    private WorkPlace workPlace;
    private Date startDate;
    private Date endDate;
    private Status status;
    private String passWord;

//    public static Personnel createNewMember(Personnel personnel) {
//        //Personnel personnel = new Personnel();
//        Team team = new Team();
//        AddressHelper addressHelper = new AddressHelper();
//        //First
//        System.out.println("Enter first name: ");
//        personnel.setFirstName(ScannerInputHelper.collectStringInput());
//
//        //Last
//        System.out.println("Enter last name: ");
//        personnel.setFirstName(ScannerInputHelper.collectStringInput());
//
//        //Address
//        System.out.println("Do you want to enter home address: ");
//        //Address homeAddress = addressHelper.homeAddressHandle();
//        String decision1 = ScannerInputHelper.collectStringInput();
//        if(decision1.equals("YES") || decision1.equals("Y")){
//            Map<AddressType, Address> m = new HashMap<>();
//            m.put(AddressType.HOME, addressHelper.homeAddressHandle());
//            personnel.setAddresses(m);
//        }
//
//        System.out.println("Do you want to enter mailing address: ");
//        //Address mailAddress = addressHelper.homeAddressHandle();
//        String decision2 = ScannerInputHelper.collectStringInput();
//        if(decision1.equals("YES") || decision1.equals("Y")){
//            Map<AddressType, Address> m = new HashMap<>();
//            m.put(AddressType.MAIL, addressHelper.homeAddressHandle());
//            personnel.setAddresses(m);
//        }
//
//        System.out.println("Do you want to enter office address: ");
//        //Address officeAddress = addressHelper.officeAddressHandle();
//        String decision3 = ScannerInputHelper.collectStringInput();
//        if(decision1.equals("YES") || decision1.equals("Y")){
//            Map<AddressType, Address> m = new HashMap<>();
//            m.put(AddressType.OFFICE, addressHelper.homeAddressHandle());
//            personnel.setAddresses(m);
//        }
//
//        //Gender
//        System.out.println("Enter gender: 'male or female': ");
//        String gender = ScannerInputHelper.collectStringInput();
//        while(!gender.equals("MALE") || (!gender.equals("FEMALE"))){
//            gender = ScannerInputHelper.collectStringInput();
//        }
//        personnel.setGender(ScannerInputHelper.collectStringInput());
//
//        //Date Of Birth
//        System.out.println("Enter date of birth (dd/MM/yyyy): ");
//        String bdate = ScannerInputHelper.collectStringInput();
//        try {
//            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(bdate);
//            personnel.setDob(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        //Email
//        //System.out.println("Please enter your email address ex:xyz@gmail.com");
//        //personnel.setEmail(ValidateHelper.emailAddressHandle());
//        //int id= 1;
//        personnel.setEmail(personnel.getFirstName()+"."+personnel.getLastName() +"@revature.com");
//
//        //Phone number
//        System.out.println("Enter phone number: 'XXX-XXX-XXX'");
//        personnel.setPhoneNumber(ValidateHelper.phoneNumberHandle());
//
//        //Work Place
//        System.out.println("Enter work place ('office' OR 'remote'): ");
//        WorkPlace wp = WorkPlace.valueOf(ScannerInputHelper.collectStringInput());
//        while(!wp.equals(WorkPlace.REMOTE) || (!wp.equals(WorkPlace.OFFICE))){
//            wp = WorkPlace.valueOf(ScannerInputHelper.collectStringInput());
//        }
//        //personnel.setWorkPlace(wp.toString());
//
//        //Start Date
//        System.out.println("Enter start date: ");
//        String sdate = ScannerInputHelper.collectStringInput();
//        try {
//            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sdate);
//            personnel.setStartDate(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        //Status
//        personnel.setStatus(Status.ACTIVE);
//
//        //Password
//        personnel.setPassWord(personnel.getFirstName()+personnel.getLastName());
//
//        //employeeService.createNewHire(null, newEmployee);
//        return personnel;
//    }
}
