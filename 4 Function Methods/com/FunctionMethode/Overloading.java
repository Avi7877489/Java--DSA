package com.FunctionMethode;

public class Overloading {
    public static void main(String[] args) {

//        fun(22);
        fun("Avijit");

        int ans = sum(2,5);
        System.out.println(ans);

        int as = sum(3,4,6);
        System.out.println(as);

    }

    static int sum (int a, int b) {
        return a + b;
    }

    static int sum (int a, int b, int c) {
        return  a + b + c;
    }
    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);

    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);

    }
}
