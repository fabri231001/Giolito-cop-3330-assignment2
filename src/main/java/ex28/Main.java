/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex28;

import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){

        int sum = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            sum += s.nextInt();
        }
        System.out.println("The total is " + sum);
    }

}
