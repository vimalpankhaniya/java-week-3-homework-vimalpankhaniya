package javaweek3homework;
// 1. Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)
import java.util.Scanner;

public class Program1 {


public static void main(String[] args) {
        String odd, even;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = scanner.nextInt();

    String evenOdd = (num % 2 == 0) ? "even" : "odd";
    System.out.println(num + " is " + evenOdd);

}
}
