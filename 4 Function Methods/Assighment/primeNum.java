package Assighment;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int ans = in.nextInt();
        if (isprime(ans)) {
            System.out.println(ans + " is a prime number");
        } else {
            System.out.println(ans + " is not a prime number");
        }
    }

    public static boolean isprime(int number) {
        if (number <= 1) {
            return false;

        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;

            }

        }
        return true;

    }

}
