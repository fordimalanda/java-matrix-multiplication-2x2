package com.fordimalanda.matrix;

public class MatrixMultiplicationApp {
    public static void main(String[] args) {
        System.out.println("Programme de calcul du produit de deux matrices 2x2");
        System.out.println("Créé par Fordi Malanda - Université de Kinshasa, Faculté de Sciences et Technologies\n");
        
        MatrixInputHandler inputHandler = new MatrixInputHandler();
        
        // Afficher le format attendu
        System.out.println("Format des matrices:");
        System.out.println("( a1     a2 )");
        System.out.println("( a3     a4 )\n");
        
        // Lecture des matrices
        Matrix matrixA = inputHandler.readMatrix("A");
        Matrix matrixB = inputHandler.readMatrix("B");
        
        // Affichage des matrices
        MatrixPrinter.printMatrix(matrixA, "A");
        MatrixPrinter.printMatrix(matrixB, "B");
        MatrixPrinter.printMultiplication(matrixA, matrixB);
        
        // Calcul du produit
        Matrix result = MatrixCalculator.multiply(matrixA, matrixB);
        
        // Affichage du résultat
        System.out.println("\nRésultat de la multiplication:");
        MatrixPrinter.printMatrix(result, "A x B");
        
        inputHandler.close();
    }
}