package javaweek3homework;
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
// HRA = basic salary 10%
// DA = Basic salary 8%
// TA = Basic salary 9%
// PF= Basic salary 20%
// Gross salary = basic salary + HRA + TA + DA –PF
//Print in following format
//_______________________________

import java.util.Scanner;

public class Program5 {

public static void main(String [] args){
    int Salary,HRA, DA, TA, PF, GROSSSALARY;

    Scanner slip =new Scanner(System.in);

    System.out.println("Salary Slip: ");
    Salary =slip.nextInt();

    System.out.println("Employee id");
    int n = slip.nextInt();

    System.out.println("Employee name");
    String m =slip.next();

    System.out.println("Enter Basic Salary");
    Salary =slip.nextInt();

    HRA = Salary *10/100;
    System.out.println("HRA "+HRA);

    TA = Salary *8/100;
    System.out.println("TA"+TA);

    DA = Salary *9/100;
    System.out.println("DA"+DA);

    PF = Salary *20/100;
    System.out.println("PF"+PF);
    GROSSSALARY = Salary+HRA+TA+DA-PF;
    System.out.println("GROSSSALARY:    "+GROSSSALARY);




}

}
