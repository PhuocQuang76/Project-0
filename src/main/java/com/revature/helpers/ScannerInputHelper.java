package com.revature.helpers;

import java.util.Locale;
import java.util.Scanner;

public class ScannerInputHelper {

    public static String collectStringInput(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine().toUpperCase();
        return value;
    }
    public static int collectIntInput(){
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        return value;
    }
}
