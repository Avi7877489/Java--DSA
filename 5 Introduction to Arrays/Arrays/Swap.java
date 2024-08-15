package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18,20};
//        swap(arr, 0, 4);
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr [index2] = temp;

    }

    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // prastices


//    static void swap(int[] arr, int ind1, int ind2) {
//        int temp = arr[ind1];
//        arr[ind1] = arr[ind2];
//        arr[ind2] = temp;
//    }


}
