package org.example.structures;

public class GigaVector<T> {

    private Vector<SuperTensor<T>> t;

    public GigaVector() {
        t = new Vector<>();
    }

    public GigaVector(Vector<SuperTensor<T>> tensors) {
        t = tensors;
    }

    public SuperTensor<T> get(int index) {
        return t.get(index);
    }

    public void set(int index, SuperTensor<T> value) {
        t.set(index, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < t.length(); i++) {
            sb.append("SuperTensor ").append(i);
            if (i == t.length() - 1) {
                sb.append("]");
            } else {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
