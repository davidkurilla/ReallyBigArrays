package org.example.structures;

public class Tensors {

    public static Tensor<Integer> newTensor(int layers, int rows, int cols) {

        Vector<Matrix<Integer>> tensor = new Vector<>(layers);
        for (int i = 0; i < tensor.length(); i++) {
            tensor.set(i, Matrices.newMatrix(rows, cols));
        }

        return new Tensor<>(tensor);
    }

    public static SuperTensor<Integer> newSuperTensor(int layers, int rows, int cols, int pool_z, int pool_x, int pool_y) {

        Vector<SuperMatrix<Integer>> tensor = new Vector<>(layers);
        for (int i = 0; i < tensor.length(); i++) {
            tensor.set(i, Matrices.newSuperMatrix(rows, cols, pool_z, pool_x, pool_y));
        }

        return new SuperTensor<>(tensor);

    }

    public static GigaTensor<Integer> newGigaTensor(int layers, int rows, int cols, int cluster_z, int cluster_x, int cluster_y, int pool_z, int pool_x, int pool_y) {

        Vector<GigaMatrix<Integer>> tensor = new Vector<>(layers);
        for (int i = 0; i < tensor.length(); i++) {
            tensor.set(i, Matrices.newGigaMatrix(rows, cols, cluster_z, cluster_x, cluster_y, pool_z, pool_x, pool_y));
        }

        return new GigaTensor<>(tensor);
    }
}