/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex32;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int num;
        System.out.println("Let's play Guess the Number!");

        num = (int) (Math.random() * 999 + 1);

        Scanner s = new Scanner(System.in);

        int temp, in, total;

        while(true){

            total=0;

            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            in = s.nextInt();

            if(in == 1)
                num = (int) (Math.random() * 10 + 1);
            else if(in == 2)
                num = (int) (Math.random() * 100 + 1);
            else
                num = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");

            do{
                total++;
                temp = s.nextInt();

                if (temp == num){
                    System.out.println("You got it in " + total + "  guesses!");
                }
                else if (temp < num)
                    System.out.println("Too low. Guess again: ");
                else if (temp > num)
                    System.out.println("Too high. Guess again: ");

            }while (temp != num);

            System.out.print("\nDo you wish to play again (Y/N)?  ");

            char cont = s.next().charAt(0);

            if(cont == 'N' || cont == 'n')
                break;
        }

    }
}
