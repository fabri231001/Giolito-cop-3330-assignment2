/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    static String output = "";

    public static boolean validateFirstName(String s){

        boolean v = true;
        if(s.length() < 2) {
            output += "The first name must be at least 2 characters long.\n";
            v = false;
        }

        if(s.length() == 0) {
            output += "The first name must be filled in.\n";
            v = false;
        }
        return v;
    }

    public static boolean validateLastName(String s) {

        boolean v = true;
        if (s.length() < 2) {
            output += "The last name must be at least 2 characters long.\n";
            v = false;

        }
        if (s.length() == 0){
            output += "The last name must be filled in.\n";
            v = false;
        }

        return v;
    }

    public static boolean validateID(String s){

        boolean v = true;
        String i = "[a-zA-Z]{2}[-]{1}[0-9]{4}";

        if(!Pattern.matches(i, s)){
            output += "The employee ID must be in the format of AA-1234.\n";
            v = false;
        }

        return v;
    }

    public static boolean validateZip(String s){

        boolean v = true;

        try{
            int conv = Integer.parseInt(s);
            if(s.length() != 5){
                output += "The zipcode must be a 5 digit number.\n";
                v = false;
            }
        }catch (Exception e){
            output += "The zipcode must be a 5 digit number.\n";
            v = false;
        }
        return v;
    }

    public static void validateInput(String fn, String ln, String zip, String ID){

        boolean f = validateFirstName(fn);
        boolean l = validateLastName(ln);
        boolean z = validateZip(zip);
        boolean i = validateID(ID);

        if(f && l && z && i)
            output += "There were no errors found.";

        System.out.println(output);
    }
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fn = s.nextLine();
        System.out.println("Enter the last name: ");
        String ln = s.nextLine();
        System.out.println("Enter the ZIP code: ");
        String zip = s.nextLine();
        System.out.println("Enter the employee ID: ");
        String ID = s.nextLine();

        validateInput(fn, ln, zip, ID);
    }
}
