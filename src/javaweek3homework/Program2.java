package javaweek3homework;
// Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not?

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){
        int year, remainder;
        Scanner vimal =new Scanner(System.in);
        System.out.println("input the year");
        year = vimal.nextInt();
        remainder = year%4;

        if(remainder==0) {
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }

    }

}
