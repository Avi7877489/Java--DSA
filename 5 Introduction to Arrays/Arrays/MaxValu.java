package Arrays;

import java.util.Scanner;

public class MaxValu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {50,3,23,9,18,66};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));

        // Input

//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//
//                arr[i] = in.nextInt();
//        }
//        System.out.println(max(arr));


    }
    static  int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }
        int maxVlu = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] > maxVlu) {
                maxVlu = arr[i];
            }
        }
        return maxVlu;
    }


    // work on edgw cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxvl = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxvl) {
                maxvl = arr[i];
            }

        }
        return maxvl;


    }

}
