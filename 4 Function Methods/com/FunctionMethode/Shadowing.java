package com.FunctionMethode;

public class Shadowing {
    static int x = 90; // This will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x); // 90

        int x; // The class variable at line 4 is shadowed by this
        // System.out.println(x); // scope will begin when value is initialised
        x = 400;
        System.out.println(x); // 40
        fun();

    }

    static void fun() {
        System.out.println(x);
    }
}
