package javaweek3homework;
// 1. Write a java program to print the numbers between 1 and 100 which can be divided by 3
//and 5 separately.
public class Program11{
    public static void main(String [] args) {
        System.out.println("Divided/3 ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + ",");
        }
        System.out.println("Divided/5");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");
    }
        }}