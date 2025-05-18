package com.fordimalanda.matrix;

import java.util.Scanner;

public class MatrixInputHandler {
    private Scanner scanner;

    public MatrixInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public Matrix readMatrix(String matrixName) {
        System.out.println("\nEntrez les valeurs pour la matrice " + matrixName);
        System.out.println("Format: ( a1 a2 )");
        System.out.println("        ( a3 a4 )\n");
        
        System.out.println("Entrez la valeur de a1");
        int a1 = scanner.nextInt();
        System.out.println("Entrez la valeur de a2");
        int a2 = scanner.nextInt();
        System.out.println("Entrez la valeur de a3");
        int a3 = scanner.nextInt();
        System.out.println("Entrez la valeur de a4");
        int a4 = scanner.nextInt();
        
        return new Matrix(a1, a2, a3, a4);
    }

    public void close() {
        scanner.close();
    }
}