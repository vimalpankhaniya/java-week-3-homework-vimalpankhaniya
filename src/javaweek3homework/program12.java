package javaweek3homework;

import java.util.Scanner;

//12. Write a program that tells us input value is number or an alphabet or symbol
public class program12 {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter Input");

        int n = v.nextInt();
        String name = v.nextLine();
        if (n >= 0)
        {
            System.out.println("Input os number");
        } else if (n < 0)
            System.out.println("input is number");
        else
            System.out.println("Input is alphabate or symbol");

        {

        }
    }



}
