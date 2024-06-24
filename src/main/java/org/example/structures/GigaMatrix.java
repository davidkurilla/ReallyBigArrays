package org.example.structures;

public class GigaMatrix<T> {

    private final Vector<GigaVector<T>> m;

    public GigaMatrix() {
        m = new Vector<>();
    }

    public GigaMatrix(Vector<GigaVector<T>> m) {
        this.m = m;
    }

    public SuperTensor<T> get(int row, int col) {
        return m.get(row).get(col);
    }

    public void set(int row, int col, SuperTensor<T> value) {
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
