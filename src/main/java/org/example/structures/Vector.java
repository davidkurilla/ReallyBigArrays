package org.example.structures;

import java.util.Arrays;

public class Vector<T> {

    private final T[] data;

    @SuppressWarnings("unchecked")
    public Vector() {
        int init_length = 5;
        data = (T[]) new Object[init_length];
    }

    @SafeVarargs
    public Vector(T... data) {
        this.data = data;
    }

    public int length() {
        return data.length;
    }

    public T get(int i) {
        return data[i];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
