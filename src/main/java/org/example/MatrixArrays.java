package org.example;

public class MatrixArrays {
    public static void main(String[] args) {
        int[] mas = new int[6];

        int[][] matrix = new int[4][3];

        matrix[2][1] = 99;
    }

    public static void printMatr(int[][] m) {
        for (int i = 0; i < m.length; i++) { //
            //
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf(" %3d", m[i][j]);
            }
            System.out.println();
        }
    }
}
