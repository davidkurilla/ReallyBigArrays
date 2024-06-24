package org.example.structures;

public class Vectors {

    public static Vector<Integer> zeros(int length) {
        Integer[] array = new Integer[length];
        Vector<Integer> vec = new Vector<>(array);
        for (int i = 0; i < array.length; i++) {
            vec.set(i, 0);
        }
        return vec;
    }
}
