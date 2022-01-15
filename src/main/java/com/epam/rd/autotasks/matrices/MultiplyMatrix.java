package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int count = 0;
        for (int i=0; i<matrix1.length; i++) {
            for (int j=0; j<matrix1[i].length; j++) {
                count++;
            }
        }
        int matrixSize1 = count; //CORRECT!
        int rows1 = matrix1.length;
        int columns1 = count/matrix1.length;
        count = 0;
        for (int i=0; i<matrix2.length; i++) {
            for (int j=0; j<matrix2[i].length; j++) {
                count++;
            }
        }
        int matrixSize2 = count; //CORRECT!
        int rows2 = matrix2.length;
        int columns2 = count/matrix2.length;
        int[][] multipliedMatrix = new int[columns2][rows1];
        for (int s=0; s<multipliedMatrix.length; s++){
            for (int c=0; c<multipliedMatrix.length; c++){
                int value = 0;
                for (int m=0; m<=matrix1[c].length; m++){
                    for (int n=0; n<matrix2.length; n++){
                        value = value + matrix1[m][n]*matrix2[n][m];
                        System.out.println(value);
                    }
                }
                multipliedMatrix[s][c] = value;
            }
        }

        // Put your code here

        return multipliedMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}};

        int[][] b = {
                {7, 8},
                {9, 10},
                {11, 12}};

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
