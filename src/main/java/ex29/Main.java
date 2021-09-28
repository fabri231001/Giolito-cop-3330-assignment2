/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex29;

import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        boolean val = false;

        while(true){

            try{
                System.out.print("What is the rate of return? ");
                int r = Integer.parseInt(s.next());
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                val = true;
            }
            catch(NumberFormatException e){
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e){
                System.out.println("Sorry. That's not a valid input");
            }

            if(val){
                break;
            }

        }
    }
}