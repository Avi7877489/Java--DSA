package Prastic;

import java.util.Arrays;
import java.util.Collections;

public class Permutation {
    public static void main(String[] args) {
       int[] premutation = {1,5,8,6,9,7,9};
        for (int i = 0; i < premutation.length; i++) {
            premutation[i] = i;
        }
        Collections.shuffle(Arrays.asList(premutation));

        System.out.println("Permutation: " + Arrays.toString(premutation));
    }
}
