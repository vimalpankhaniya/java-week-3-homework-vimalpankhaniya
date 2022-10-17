package javaweek3homework;

import javax.naming.Name;
import java.util.Objects;
import java.util.Scanner;

//  Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class Program8 {

    public static void main (String [] args) {

        Scanner town = new Scanner(System.in);
        System.out.println("Print City Name A to F : ");
        String cityName = town.nextLine();
        if (Objects.equals(cityName.toUpperCase(),  "A")) {
            System.out.println("City Name : Ahm");
        } else if (Objects.equals(cityName.toUpperCase(),"B") ) {
            System.out.println("City Name : Bom");
        } else if (Objects.equals(cityName.toUpperCase(), "C")) {
            System.out.println("City Name : Cardiff");
        } else if (Objects.equals(cityName.toUpperCase(), "D")) {
            System.out.println("City Name : Devon");
        } else if (Objects.equals(cityName.toUpperCase(), "E")) {
            System.out.println("City Name : Edinburg");
        } else if (Objects.equals(cityName.toUpperCase(), "F")) {
            System.out.println("City Name : Fanbourgh");
        } else {
            System.out.println("Error : Invalid Entry");


        }
    }

    }






