package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(267);
//        list.add(667);
//        list.add(647);
//        list.add(567);
//        list.add(89567);
//        list.add(67);
//        list.add(267);
//        list.add(667);
//        list.add(647);
//        list.add(567);
//        list.add(89567);


//        System.out.println(list.contains(6672));
//        list.set(0,99);
//        list.remove(2);
//
//
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // Get Item  at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
