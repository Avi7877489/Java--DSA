package Assighment;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        /*
        write the program to print the circumference and area of a circle of radius entered
         by the user by defining your own method
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The number: ");
        double radius = in.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area is : " + area);
        double circmference = Math.PI*2*radius;
        System.out.println("Circmference is : " + circmference);

    }
}
