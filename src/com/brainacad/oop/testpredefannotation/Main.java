package com.brainacad.oop.testpredefannotation;

/**
 * Created by User on 18.04.2018.
 */
public class Main {
    @Deprecated
    private static int findMax(int... array) {
        if (array.length > 0) {
            int max = array[0];
            for (int item : array)
                if (item > max)
                    max = item;
            return max;
        } else {
            throw new RuntimeException("Array has 0 length");
        }
    }

    @SafeVarargs
    private static <T extends Comparable> T findMax(T... array1) {
        if (array1.length > 0) {
            T max = array1[0];
            for (T item : array1)
                if (item.compareTo(max) == 1)
                    max = item;
            return max;
        } else {
            throw new RuntimeException("Array has 0 length");
        }
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        //System.out.println(findMax(1, 2, 4, -2, 10));
        System.out.println(findMax(new Double(12), new Double(-15), new Double(14)));

    }
}
