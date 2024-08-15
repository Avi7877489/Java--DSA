package com.FunctionMethode;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {

        fun(2,3,2,3,6,896,6565);
        multiple(2,2,"Avijit", "Shivam" ,"jagat");

        demo(1,6,85,96);
        demo("Avijit", "dfkhgh");

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String...v) {
        System.out.println(Arrays.toString(v));


    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));

    }
}
