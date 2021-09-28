/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex26;

import java.util.Scanner;

public class PaymentCalculator {

    public static int calculateMonthsUntilPaidOff(double apr, double b, double p){

        double i = apr/365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + b/p * (1 - Math.pow(1 + i, 30)))/ Math.log(1 + i));
    }

    public static void main(String[] args){

        double apr, b, p;

        Scanner s = new Scanner(System.in);
        System.out.println("What is your balance? ");
        b = s.nextDouble();
        System.out.println("What is the APR on the card (as a percent)? ");
        apr = s.nextDouble();
        apr = apr/100;
        System.out.println("What is the monthly payment you can make? ");
        p = s.nextDouble();

        int m = calculateMonthsUntilPaidOff(apr, b, p);
        System.out.println("It will take you " + m + " months to pay off this card.");
    }
}
