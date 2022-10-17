package javaweek3homework;

import java.util.Scanner;

public class Program9 {

        public static void main(String [] args) {
        }
        {Scanner letter = new Scanner (System.in);
            String a = letter.toString();

            switch (a.toUpperCase()){
                case "A":
                    System.out.println("city is Ahm");
                    break;
                case "B":
                    System.out.println("city is Bom");
                    break;
                case "C":
                    System.out.println("city is Cardiff");
                    break;
                case "D":
                    System.out.println("city is Devon");
                    break;
                case "E":
                    System.out.println("city is Edinburgh");
                    break;
                case "F":
                    System.out.println("city is Fanbourgh");
                    break;
                default:
                    System.out.println("Error: Invalid entry");


            }

        }
    }

