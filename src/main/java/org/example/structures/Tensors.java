package org.example.structures;

public class Tensors {

    public static Tensor<Integer> newTensor() {
        Vector<Integer> vec1 = Vectors.zeros(5);
        Vector<Integer> vec2 = Vectors.zeros(5);
        Vector<Integer> vec3 = Vectors.zeros(5);
        Vector<Integer> vec4 = Vectors.zeros(5);
        Vector<Integer> vec5 = Vectors.zeros(5);
        Vector<Integer> vec6 = Vectors.zeros(5);
        Vector<Integer> vec7 = Vectors.zeros(5);
        Vector<Integer> vec8 = Vectors.zeros(5);
        Vector<Integer> vec9 = Vectors.zeros(5);

        Matrix<Integer> mat1 = new Matrix<>(new Vector<>(vec1, vec2, vec3));
        Matrix<Integer> mat2 = new Matrix<>(new Vector<>(vec4, vec5, vec6));
        Matrix<Integer> mat3 = new Matrix<>(new Vector<>(vec7, vec8, vec9));

        return new Tensor<>(new Vector<>(mat1, mat2, mat3));
    }

    public static SuperTensor<Integer> newSuperTensor() {
        Tensor<Integer> ten1 = Tensors.newTensor();
        Tensor<Integer> ten2 = Tensors.newTensor();
        Tensor<Integer> ten3 = Tensors.newTensor();
        Tensor<Integer> ten4 = Tensors.newTensor();
        Tensor<Integer> ten5 = Tensors.newTensor();
        Tensor<Integer> ten6 = Tensors.newTensor();
        Tensor<Integer> ten7 = Tensors.newTensor();
        Tensor<Integer> ten8 = Tensors.newTensor();
        Tensor<Integer> ten9 = Tensors.newTensor();

        Tensor<Integer> ten10 = Tensors.newTensor();
        Tensor<Integer> ten11 = Tensors.newTensor();
        Tensor<Integer> ten12 = Tensors.newTensor();
        Tensor<Integer> ten13 = Tensors.newTensor();
        Tensor<Integer> ten14 = Tensors.newTensor();
        Tensor<Integer> ten15 = Tensors.newTensor();
        Tensor<Integer> ten16 = Tensors.newTensor();
        Tensor<Integer> ten17 = Tensors.newTensor();
        Tensor<Integer> ten18 = Tensors.newTensor();

        Tensor<Integer> ten19 = Tensors.newTensor();
        Tensor<Integer> ten20 = Tensors.newTensor();
        Tensor<Integer> ten21 = Tensors.newTensor();
        Tensor<Integer> ten22 = Tensors.newTensor();
        Tensor<Integer> ten23 = Tensors.newTensor();
        Tensor<Integer> ten24 = Tensors.newTensor();
        Tensor<Integer> ten25 = Tensors.newTensor();
        Tensor<Integer> ten26 = Tensors.newTensor();
        Tensor<Integer> ten27 = Tensors.newTensor();

        SuperVector<Integer> sv1 = new SuperVector<>(new Vector<>(ten1, ten2, ten3));
        SuperVector<Integer> sv2 = new SuperVector<>(new Vector<>(ten4, ten5, ten6));
        SuperVector<Integer> sv3 = new SuperVector<>(new Vector<>(ten7, ten8, ten9));

        SuperVector<Integer> sv4 = new SuperVector<>(new Vector<>(ten10, ten11, ten12));
        SuperVector<Integer> sv5 = new SuperVector<>(new Vector<>(ten13, ten14, ten15));
        SuperVector<Integer> sv6 = new SuperVector<>(new Vector<>(ten16, ten17, ten18));

        SuperVector<Integer> sv7 = new SuperVector<>(new Vector<>(ten19, ten20, ten21));
        SuperVector<Integer> sv8 = new SuperVector<>(new Vector<>(ten22, ten23, ten24));
        SuperVector<Integer> sv9 = new SuperVector<>(new Vector<>(ten25, ten26, ten27));

        SuperMatrix<Integer> sm1 = new SuperMatrix<>(new Vector<>(sv1, sv2, sv3));
        SuperMatrix<Integer> sm2 = new SuperMatrix<>(new Vector<>(sv4, sv5, sv6));
        SuperMatrix<Integer> sm3 = new SuperMatrix<>(new Vector<>(sv7, sv8, sv9));

        return new SuperTensor<>(new Vector<>(sm1, sm2, sm3));
    }

    public static GigaTensor<Integer> newGigaTensor() {
        SuperTensor<Integer> st1 = Tensors.newSuperTensor();
        SuperTensor<Integer> st2 = Tensors.newSuperTensor();
        SuperTensor<Integer> st3 = Tensors.newSuperTensor();

        SuperTensor<Integer> st4 = Tensors.newSuperTensor();
        SuperTensor<Integer> st5 = Tensors.newSuperTensor();
        SuperTensor<Integer> st6 = Tensors.newSuperTensor();

        SuperTensor<Integer> st7 = Tensors.newSuperTensor();
        SuperTensor<Integer> st8 = Tensors.newSuperTensor();
        SuperTensor<Integer> st9 = Tensors.newSuperTensor();

        SuperTensor<Integer> st10 = Tensors.newSuperTensor();
        SuperTensor<Integer> st11 = Tensors.newSuperTensor();
        SuperTensor<Integer> st12 = Tensors.newSuperTensor();

        SuperTensor<Integer> st13 = Tensors.newSuperTensor();
        SuperTensor<Integer> st14 = Tensors.newSuperTensor();
        SuperTensor<Integer> st15 = Tensors.newSuperTensor();

        SuperTensor<Integer> st16 = Tensors.newSuperTensor();
        SuperTensor<Integer> st17 = Tensors.newSuperTensor();
        SuperTensor<Integer> st18 = Tensors.newSuperTensor();

        SuperTensor<Integer> st19 = Tensors.newSuperTensor();
        SuperTensor<Integer> st20 = Tensors.newSuperTensor();
        SuperTensor<Integer> st21 = Tensors.newSuperTensor();

        SuperTensor<Integer> st22 = Tensors.newSuperTensor();
        SuperTensor<Integer> st23 = Tensors.newSuperTensor();
        SuperTensor<Integer> st24 = Tensors.newSuperTensor();

        SuperTensor<Integer> st25 = Tensors.newSuperTensor();
        SuperTensor<Integer> st26 = Tensors.newSuperTensor();
        SuperTensor<Integer> st27 = Tensors.newSuperTensor();

        GigaVector<Integer> gv1 = new GigaVector<>(new Vector<>(st1, st2, st3));
        GigaVector<Integer> gv2 = new GigaVector<>(new Vector<>(st4, st5, st6));
        GigaVector<Integer> gv3 = new GigaVector<>(new Vector<>(st7, st8, st9));

        GigaVector<Integer> gv4 = new GigaVector<>(new Vector<>(st10, st11, st12));
        GigaVector<Integer> gv5 = new GigaVector<>(new Vector<>(st13, st14, st15));
        GigaVector<Integer> gv6 = new GigaVector<>(new Vector<>(st16, st17, st18));

        GigaVector<Integer> gv7 = new GigaVector<>(new Vector<>(st19, st20, st21));
        GigaVector<Integer> gv8 = new GigaVector<>(new Vector<>(st22, st23, st24));
        GigaVector<Integer> gv9 = new GigaVector<>(new Vector<>(st25, st26, st27));

        GigaMatrix<Integer> gm1 = new GigaMatrix(new Vector<>(gv1, gv2, gv3));
        GigaMatrix<Integer> gm2 = new GigaMatrix(new Vector<>(gv4, gv5, gv6));
        GigaMatrix<Integer> gm3 = new GigaMatrix(new Vector<>(gv7, gv8, gv9));

        return new GigaTensor<>(new Vector<>(gm1, gm2, gm3));
    }
}
