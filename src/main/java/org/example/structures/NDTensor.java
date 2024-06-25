package org.example.structures;

public class NDTensor<T> {

    private final T[] data;
    private final int[] dimensions;

    @SuppressWarnings("unchecked")
    public NDTensor(int... dimensions) {
        this.dimensions = dimensions;

        int size = 1;
        for (int dim : dimensions) size *= dim;

        data = (T[])(new Object[size]);
    }

    private int getIndex(int... coordinates) {
        if (coordinates.length != dimensions.length) {
            throw new java.lang.IllegalArgumentException(String.format("Expected %d-dimensional coordinates, %d-dimensional given.", dimensions.length, coordinates.length));
        }

        int index = 0;
        int prod = 1;
        for (int i = 0; i < coordinates.length; i++) {
            index += coordinates[i] * prod;
            prod *= dimensions[i];
        }

        return index;
    }

    public T get(int... coordinates) {
        return data[getIndex(coordinates)];
    }

    public void set(T value, int... coordinates) {
        data[getIndex(coordinates)] = value;
    }
}
