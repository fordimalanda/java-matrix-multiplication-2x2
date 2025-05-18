package com.fordimalanda.matrix;

public class MatrixCalculator {
    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        int p1 = (matrix1.getA1() * matrix2.getA1()) + (matrix1.getA2() * matrix2.getA3());
        int p2 = (matrix1.getA1() * matrix2.getA2()) + (matrix1.getA2() * matrix2.getA4());
        int p3 = (matrix1.getA3() * matrix2.getA1()) + (matrix1.getA4() * matrix2.getA3());
        int p4 = (matrix1.getA3() * matrix2.getA2()) + (matrix1.getA4() * matrix2.getA4());
        
        return new Matrix(p1, p2, p3, p4);
    }
}