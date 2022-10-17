package javaweek3homework;

public class Program18 {

    public  static void main(String[] args) {
        int my_array[] = {10,20,30,40,50,};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}


