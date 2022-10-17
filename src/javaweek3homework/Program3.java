package javaweek3homework;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
        String name, Result,Grade;
        int Rollno, Maths,Science,English, Total, Percentage, Marks;

        Scanner card = new Scanner(System.in);

        System.out.println("Print your name: ");
        name = card.nextLine();

        System.out.println("Enter your Roll No:");
        Rollno =card.nextInt();

        System.out.println("Enter your Maths Mark:");
        Maths =card.nextInt();

        System.out.println("Enter your Science Mark:");
        Science =card.nextInt();

        System.out.println("Enter your English Mark:");
        English =card.nextInt();

        Total = Maths + Science + English;

        if (Maths >=0 && Maths <=100 && Science >=0 && Science <=100 && English >=0 && English <=100) {
            Percentage = Total / 3;

            if (Maths >= 35 && Science >= 35 && English >= 35) {
                Result = "Pass";
            } else {
                Result = "Fail";

                Grade = card.nextLine();
                if (Percentage >= 80) {
                    Grade = "A+";
                } else if (Percentage >= 60) {
                    Grade = "A";
                } else if (Percentage >= 50) {
                    Grade = "B";
                } else if (Percentage >= 35) {
                    Grade = "C";
                }

                System.out.println("----------------------------");
                System.out.println("|                          |");
                System.out.println("|           MARK SHEET      |");
                System.out.println("----------------------------");
                System.out.println("|  Name    :" + name + "      |");
                System.out.println("|  Roll No   :" + Rollno + "   |");
                System.out.println("----------------------------");
                System.out.println("|  Subject    :  MArks   |");
                System.out.println("----------------------------");
                System.out.println("|  Maths    :" + Maths + "      |");
                System.out.println("|  Science   :" + Science + "   |");
                System.out.println("|  English    :" + English + "  |");
                System.out.println("----------------------------");
                System.out.println("|  Total    :" + Total + "      |");
                System.out.println("----------------------------");
                System.out.println("|  Percentage   :" + Percentage + "|");
                System.out.println("|  Result  :" + Result + "   |");
                System.out.println("|  Grade    :" + Grade + "  |");
                System.out.println("----------------------------");

            }

                System.out.println("Invlid inpit between 0 to 100");





        }}}
