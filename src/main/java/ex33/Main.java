/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ex33;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        String[] ans = {"Yes.", "No.", "Maybe.", "Ask again later."};

        System.out.println("What is your question? ");
        Scanner s = new Scanner(System.in);
        String q = s.nextLine();

        Random rand = new Random();
        int r = rand.nextInt(5);

        String fin = ans[r];

        System.out.println(fin);
    }
}
