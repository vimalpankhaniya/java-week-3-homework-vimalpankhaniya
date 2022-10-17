package javaweek3homework;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
    int Amount, Salary, Commission;
    Scanner h = new Scanner(System.in);
    System.out.print("Sales id ");
    int n = h.nextInt();

    System.out.print("Seller's Name");
    String m = h.next();

    System.out.print("Sales Amout");
    Amount =h.nextInt();

    if(Amount >=50000)

    {
        System.out.println("Commission 35%");
    }

    {
        if (Amount >= 30000)
            System.out.println("Commission 20%");
    }
          if (Amount >=20000)

    {
        System.out.println("Commission 10%");

    }
}}
