package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of Primitive
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 223;
        arr[3] = 545;
        arr[4] = 3;
        // [23, 45, 223, 545, 3]
        System.out.println(arr[3]);

        // Input using for loops

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr) {  // for every in array , print the element
//            System.out.print(num + " "); //Here num represents element of the array
//        }

//        System.out.println(arr[5]); // index out of bound error

        // Array of Objet
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));

        // Modify
        str[1] = "Avijit";
        System.out.println(Arrays.toString(str));

    }
}
