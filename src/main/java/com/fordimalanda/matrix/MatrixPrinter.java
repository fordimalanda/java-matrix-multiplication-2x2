package com.fordimalanda.matrix;

public class MatrixPrinter {
    public static void printMatrix(Matrix matrix, String name) {
        System.out.println("\nMatrice " + name + ":");
        System.out.println("( " + matrix.getA1() + "     " + matrix.getA2() + " )");
        System.out.println("( " + matrix.getA3() + "     " + matrix.getA4() + " )");
    }

    public static void printMultiplication(Matrix m1, Matrix m2) {
        System.out.println("\nReprésentation de l'opération:");
        System.out.println("( " + m1.getA1() + "     " + m1.getA2() + " )\t     ( " + m2.getA1() + "     " + m2.getA2() + " )");
        System.out.println("\t\tx");
        System.out.println("( " + m1.getA3() + "     " + m1.getA4() + " )\t     ( " + m2.getA3() + "     " + m2.getA4() + " )");
    }
}