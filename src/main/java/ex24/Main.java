/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex24;

import java.util.Scanner;

public class Main {

    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length())
            return false;
        else{
            boolean t;
            for(int i = 0; i < s1.length(); i++){
                t = false;
                for(int j = 0; j < s2.length(); j++){
                    if(s1.charAt(i) == s2.charAt(j))
                        t = true;
                }
                if(!t)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter two strings and I'll tell you if they are anagrams:\n" +
                "Enter the first string: ");
        Scanner s1 = new Scanner(System.in);
        String a1 = s1.nextLine();
        System.out.println("Enter the second string: ");
        Scanner s2 = new Scanner(System.in);
        String a2 = s2.nextLine();

        if(isAnagram(a1,a2))
            System.out.println("\"" + a1 + "\" and \"" + a2 + "\" are anagrams.");
        else
            System.out.println("\"" + a1 + "\" and \"" + a2 + "\" are not anagrams.");

    }
}
