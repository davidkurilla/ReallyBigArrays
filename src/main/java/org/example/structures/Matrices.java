package org.example.structures;

public class Matrices {

    public static Matrix<Integer> newMatrix(int rows, int cols) {

        Vector<Vector<Integer>> matrix = new Vector<>(rows);
        for (int i = 0; i < matrix.length(); i++) {
            matrix.set(i, Vectors.newVector(cols));
        }
        return new Matrix<>(matrix);
    }

    public static SuperMatrix<Integer> newSuperMatrix(int rows, int cols, int tensor_z, int tensor_x, int tensor_y) {

        Vector<SuperVector<Integer>> matrix = new Vector<>(rows);
        for (int i = 0; i < matrix.length(); i++) {
            matrix.set(i, Vectors.newSuperVector(cols, tensor_z, tensor_x, tensor_y));
        }
        return new SuperMatrix<>(matrix);
    }

    public static GigaMatrix<Integer> newGigaMatrix(int rows, int cols, int cluster_z, int cluster_x, int cluster_y, int pool_z, int pool_x, int pool_y) {

        Vector<GigaVector<Integer>> matrix = new Vector<>(rows);
        for (int i = 0; i < matrix.length(); i++) {
            matrix.set(i, Vectors.newGigaVector(cols, cluster_z, cluster_x, cluster_y, pool_z, pool_x, pool_y));
        }
        return new GigaMatrix<>(matrix);
    }
}
