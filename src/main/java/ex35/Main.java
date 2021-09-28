/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fabrizio Giolito
 */


package ex35;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<String> n = new ArrayList<String>();
        String in;
        Scanner s = new Scanner(System.in);

        do{
            System.out.println("Enter a name: ");
            in = s.nextLine();
            n.add(in);
        }while(!in.isEmpty());

        Random r = new Random();

        n.remove(n.size() - 1);
        System.out.println("The winner is " + n.get(r.nextInt(n.size())));
    }
}
