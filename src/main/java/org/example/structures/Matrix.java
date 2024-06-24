package org.example.structures;

public class Matrix<T> {

    private final Vector<Vector<T>> v;

    public Matrix() {
        v = new Vector<>(new Vector<>());
    }

    public Matrix(Vector<Vector<T>> v) {
        this.v = v;
    }

    public T get(int row, int col) {
        return v.get(row).get(col);
    }

    public void set(int row, int col, T value) {
        v.get(row).set(col, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < v.length(); i++) {
            sb.append(v.get(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
