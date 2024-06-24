package org.example.structures;

public class SuperMatrix<T> {

    private final Vector<SuperVector<T>> m;

    public SuperMatrix() {
        m = new Vector<>();
    }

    public SuperMatrix(Vector<SuperVector<T>> m) {
        this.m = m;
    }

    public Tensor<T> get(int row, int col) {
        return m.get(row).get(col);
    }

    public void set(int row, int col, Tensor<T> value) {
        m.get(row).set(col, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m.length(); i++) {
            sb.append(m.get(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
