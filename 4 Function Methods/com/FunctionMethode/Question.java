package com.FunctionMethode;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
//
//        boolean a = isArmstrong(n);
//        System.out.println(a);

        for (int i = 100; i < 400; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }

        }


    }
    // Print all 3 digits armstrong numbers
    static boolean isArmstrong(int n) {
        int original =  n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem ;
        }
        return sum == original;
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c ==0) {
                return false;
            }
            c++;
        }
        return c * c > n;
//        if (c * c > n) {
//            return true;
//        }
//        return false;
    }
}
