package Assighment;

import java.util.Scanner;

public class SumPfNum {
    public static void main(String[] args) {
        /*
        write a program to print the sum of two numbers entered by user by defining your own
        method
         */
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();
        sum(num1,num2);

    }
    static void sum(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        System.out.println("Sum of the two number is: " +sum);
    }
}
