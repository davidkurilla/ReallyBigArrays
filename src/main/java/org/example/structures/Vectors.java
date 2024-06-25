package org.example.structures;

public class Vectors {

    public static Vector<Integer> newVector(int length) {
        Integer[] array = new Integer[length];
        Vector<Integer> vec = new Vector<>(array);
        for (int i = 0; i < array.length; i++) {
            vec.set(i, 0);
        }
        return vec;
    }

    public static SuperVector<Integer> newSuperVector(int length, int tensor_z, int tensor_x, int tensor_y) {
        Vector<Tensor<Integer>> svec = new Vector<>(length);
        for (int i = 0; i < svec.length(); i++) {
            svec.set(i, Tensors.newTensor(tensor_z, tensor_x, tensor_y));
        }
        return new SuperVector<>(svec);
    }

    public static GigaVector<Integer> newGigaVector(int length, int cluster_z, int cluster_x, int cluster_y, int pool_z, int pool_x, int pool_y) {
        Vector<SuperTensor<Integer>> gvec = new Vector<>(length);
        for (int i = 0; i < gvec.length(); i++) {
            gvec.set(i, Tensors.newSuperTensor(cluster_z, cluster_x, cluster_y, pool_z, pool_x, pool_y));
        }
        return new GigaVector<>(gvec);
    }
}
