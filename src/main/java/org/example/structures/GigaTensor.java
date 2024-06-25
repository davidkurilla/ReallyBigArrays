package org.example.structures;

public class GigaTensor<T> {

    private Vector<GigaMatrix<T>> t;

    public GigaTensor() {
        t = new Vector<>();
    }

    public GigaTensor(Vector<GigaMatrix<T>> matrices) {
        t = matrices;
    }

    public SuperTensor<T> get(int layer, int row, int col) {
        return t.get(layer).get(row, col);
    }

    public void set(int layer, int row, int col, SuperTensor<T> value) {
        t.get(layer).set(row, col, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            sb.append("Tensor Cluster ").append(i).append("\n");
            sb.append(t.get(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
