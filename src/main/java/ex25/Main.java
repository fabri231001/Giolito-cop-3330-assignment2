/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex25;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Main {
    public static int passwordValidator(String s){

        boolean isN = false, isL = false, isSC = false;

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                isN = true;
            if(Character.isLetter(s.charAt(i)))
                isL = true;
            if(s.charAt(i) == '~' || s.charAt(i) == '!' || s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '$' || s.charAt(i) == '%' || s.charAt(i) == '^' || s.charAt(i) == '&' || s.charAt(i) == '*' || s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '_' || s.charAt(i) == '-')
                isSC = true;
        }
        if(s.length() < 8){
            if(isN && !isL && !isSC)
                return 0;
            if(!isN && isL && !isSC)
                return 1;
        }
        if(isN && isL && !isSC)
            return 3;
        if(isN && isL && isSC)
            return 4;

        return -1;
    }
    public static void main(String[] args){

        System.out.println("Enter password: ");
        Scanner s = new Scanner(System.in);
        String p = s.nextLine();
        int strength = passwordValidator(p);

        if(strength == -1)
            p = "What you entered was not valid please try again.";
        if(strength == 0)
            p = "The password '" + p + "' is a very weak password" ;
        if(strength == 1)
            p = "The password '" + p + "' is a weak password" ;
        if(strength == 3)
            p = "The password '" + p + "' is a strong password" ;
        if(strength == 4)
            p = "The password '" + p + "' is a very strong password" ;

        System.out.println(p);
    }
}
