package Assighment;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {

    /* A person is eligible to vote if his / her aage is getter than or equal to 18.
    Define a method to find out if he / she is eligible to vote */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Yor Age= ");
        int age = in.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for vote");
        } else if (age == 0) {
            System.out.println("Are you kidding");
        } else {
            System.out.println("You are not eligible for vote");
        }


    }
}