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
        int[][] multipliedMatrix = new int[rows1][columns2];
        int volumeOfMultipliedMatrix = columns2*rows1;
        for (int s=0; s<rows1; s++){
            for (int c=0; c<columns2; c++){
                int value = 0;
                for (int m=0; m<matrix2.length; m++){ // This variable always changes in the same way.
                        value = value + matrix1[s][m]*matrix2[m][c];
                }
                multipliedMatrix[s][c] = value; // Final value for the position [s][c].
            }
        }
        return multipliedMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {{30677, 22226, 98579, 29722, 99811, 75808, 69830},
                {16451, 12335, 15446, 80587, 4606, 1001, 71816},
                {13377, 8508, 9017, 14297, 9625, 35281, 84814},
                {15583, 55032, 744, 43910, 17507, 11389, 33551},
                {20736, 59730, 68865, 64273, 7336, 37991, 49340}};
        int[][] b = {{5713, 1153, 78026, 42712, 874, 40184, 21640},
                {11439, 39854, 48725, 29835, 40397, 42793, 96174},
                {59566, 50707, 89470, 1940, 62491, 1522, 40563},
                {12081, 79616, 6822, 1187, 7102, 97830, 19018},
                {65133, 76778, 3676, 99025, 69500, 74207, 75421},
                {85454, 28730, 87497, 18289, 10615, 99380, 52115},
                {11595, 91888, 30874, 33217, 40897, 47383, 40570}};

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
