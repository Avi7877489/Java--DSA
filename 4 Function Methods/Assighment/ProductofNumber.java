package Assighment;

import java.util.Scanner;

public class ProductofNumber {
    public static void main(String[] args) {


    /*
    Define a method that returns the product of two numbers entered by user
     */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1 = in.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = in.nextInt();


//        product(num1,num2);
        int sum = product(num1,num2);
        System.out.println("Product of the two number: " + sum);

    }

//    static void product(int x, int y) {
//        int result = x * y;
//        System.out.println("Product of the two number: " + result);
//    }


    static int  product(int x, int y) {
        int result = x * y;
        return result;
    }
}
