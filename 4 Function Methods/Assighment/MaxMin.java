package Assighment;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        // Define two methods to print the maximum and minimum number respectively and among three numbers entered by the user

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");

        System.out.println("pls enter 1st number: ");
        int first = in.nextInt();
        System.out.println("pls enter 2nd number: ");
        int second = in.nextInt();
        System.out.println("pls enter 3rd number: ");
        int third = in.nextInt();

        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        System.out.println("Maximum value: " + max);

        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        System.out.println("Minimum Value: " + min);
    }
}
