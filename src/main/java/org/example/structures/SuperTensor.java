package org.example.structures;

public class SuperTensor<T> {

    private Vector<SuperMatrix<T>> t;

    public SuperTensor() {
        t = new Vector<>();
    }

    public SuperTensor(Vector<SuperMatrix<T>> matrices) {
        t = matrices;
    }

    public Tensor<T> get(int layer, int row, int col) {
        return t.get(layer).get(row, col);
    }

    public void set(int layer, int row, int col, Tensor<T> value) {
        t.get(layer).set(row, col, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            sb.append("Layer ").append(i).append("\n");
            sb.append(t.get(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
