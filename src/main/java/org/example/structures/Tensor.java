package org.example.structures;

public class Tensor<T> {

    private Vector<Matrix<T>> m;

    public Tensor() {
        m = new Vector<>(new Matrix<>());
    }

    public Tensor(Vector<Matrix<T>> m) {
        this.m = m;
    }

    public T get(int layer, int row, int col) {
        return m.get(layer).get(row, col);
    }

    public void set(int layer, int row, int col, T value) {
        m.get(layer).set(row, col, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m.length(); i++) {
            sb.append("Layer ").append(i).append("\n");
            sb.append(m.get(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
