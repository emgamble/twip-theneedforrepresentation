package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    Scanner wordReader = new Scanner(System.in);
    System.out.println("Enter Word Here: ");
    String a = wordReader.nextLine();

    int wordLength = a.length();
    //System.out.println("length: " + wordLength);






    Random startRandom = new Random();
    int randm = startRandom.nextInt(5);
    //System.out.println("randm: " + randm);

    double percent = Math.random();
    //System.out.println("percent" + percent );
    int start = (int) (percent * wordLength);
    //System.out.println("start: " + start);

    int count = 0;


    while (count < wordLength) {
        int AsciiValue = a.charAt(start);
        //System.out.println("Ascii Value: " + AsciiValue);
        count++;
        start++;
        randm++;
        if (start >= wordLength) {
            start = start - wordLength;
        }


        if (randm > 5) {
            randm = randm - 5;
        }


        if (randm == 1)
           System.out.print(Integer.toString((AsciiValue - 64),2));
        else if (randm == 2)
            System.out.print(Integer.toString((AsciiValue-64),8));
        else if (randm == 3)
            System.out.print(AsciiValue);
        else if (randm == 4)
            System.out.print(Integer.toString((AsciiValue-64),16));
        else if (randm == 5)
            System.out.print(a.charAt(start));

    }

















    }
}
