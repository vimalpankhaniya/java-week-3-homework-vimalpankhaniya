package javaweek3homework;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a Number");
        int v = in.nextInt();

        if (v > 0) {
            System.out.println("Number is Postive ");

        } else if (v < 0)
            System.out.println("Number is Negative");

         else

        System.out.println("Number is zero");
    }
}
