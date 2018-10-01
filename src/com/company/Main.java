package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    Scanner wordReader = new Scanner(System.in);
    System.out.println("Enter Word Here: ");
    String a = wordReader.nextLine();
    a.toUpperCase();
    int c = a.length();



    Random startRandom = new Random();
    int r = startRandom.nextInt(5)+1;
    //System.out.println(r);

    double p = Math.random();
    int s = (int) p * c;











    //if (r == 1)
        //binary
        //for(int j=0; j<= c; j++)
            //s = s + 1;
            //count ++;




   // else if (r == 2)
        //octal
    //else if ( r == 3)
        //decimal
   // else if (r == 4)
        //hex
    //else
        //ASCII










    }
}
