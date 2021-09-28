/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex31;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        float r;
        try{
            System.out.print("Enter your Age : ");

            int a = s.nextInt();

            System.out.print("Enter your resting heart rate : ");

            float hr = s.nextFloat();

            System.out.println("Resting Pulse : " + hr + "      Age : " + a);
            System.out.println("Intensity   | Rate");
            System.out.println("------------|----------");

            for (int i = 55; i <= 95; i += 5) {
                r = (((220 - a) - hr) * i/100) + hr;
                System.out.println(i + "%" + "         | " + Math.round(r) + " bpm");
            }
        } catch(Exception e){
            System.out.println("Enter only numbers...");
        }
    }
}