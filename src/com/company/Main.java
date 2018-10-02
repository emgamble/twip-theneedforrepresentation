package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    Scanner wordReader = new Scanner(System.in);
    System.out.println("Enter Word Here: ");
    String a = wordReader.nextLine();

    int wordLength = a.length();
   // int ascii = a.charAt(0);
   // System.out.println(ascii);





    Random startRandom = new Random();
    int randm = startRandom.nextInt(5);
    System.out.println(randm);
    double percent = Math.random();
    int start = (int) percent * wordLength;
    //System.out.println(start);

    int count = 0;


    while (count < wordLength) {
        int AsciiValue = a.charAt(start);
        System.out.println(AsciiValue);
        count++;
        start++;
        randm++;
        if (start > wordLength) {
            start = start - wordLength;
        }


        if (randm > 5) {
            randm = randm - 5;
        }


        if (randm == 1)
           System.out.print(Integer.toBinaryString(AsciiValue - 64));
        else if (randm == 2)
            System.out.print(Integer.toOctalString(AsciiValue-64));
        else if (randm == 3)
            System.out.print(AsciiValue);
        else if (randm == 4)
            System.out.print(Integer.toHexString(AsciiValue-64));
        else if (randm == 5)
            System.out.print(a.charAt(start));

    }





       // if (random == 1)
        //binary
            //for(int j=0; j<= wordLength; j++)
                //start = start + 1;





        //else if (random == 2)
        //octal
        //else if (random == 3)
        //decimal
        //else if (random == 4)
        //hex
       // else
        //ASCII










    }
}
