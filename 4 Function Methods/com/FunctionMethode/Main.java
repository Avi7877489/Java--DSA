package com.FunctionMethode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q : Take input of two number and print sum
        int num1, num2, sum;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number 1 : ");
        num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
