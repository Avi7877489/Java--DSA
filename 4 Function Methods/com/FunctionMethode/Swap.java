package com.FunctionMethode;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Swap a numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);

        System.out.println(a + " " + b);

        String name = " Avijit Ghosh";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "fg"; // Creating a new object
    }

    static void swap(int a, int b){  // Can not swap
        int temp = a;
        a = b;
        b = temp;
    }
}
