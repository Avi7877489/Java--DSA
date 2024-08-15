package com.FunctionMethode;

public class Scoop {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";
        {
            //int a = 78; // a;ready initialized outside the block in the same
             a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
//            System.out.println(c);
            name = "Avi";
            System.out.println(name); // va;ues initialised in this block , will remain in block
        }
        System.out.println(a);
        System.out.println(name);
       // System.out.println(c);// Cannot use outside the block;
        int c = 200;

        // Scooping in For loop

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 1000;
        }
        System.out.println(a);

    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
