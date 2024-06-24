package org.example.structures;

public class SuperVector<T> {

    private Vector<Tensor<T>> t;

    public SuperVector() {
        t = new Vector<>(new Tensor<>());
    }

    public SuperVector(Vector<Tensor<T>> tensors) {
        t = tensors;
    }

    public Tensor<T> get(int index) {
        return t.get(index);
    }

    public void set(int index, Tensor<T> value) {
        t.set(index, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < t.length(); i++) {
            sb.append("Tensor ").append(i);
            if (i == t.length() - 1) {
                sb.append("]");
            } else {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
