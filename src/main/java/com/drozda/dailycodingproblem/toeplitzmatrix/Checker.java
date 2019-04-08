package com.drozda.dailycodingproblem.toeplitzmatrix;

public class Checker {
    boolean isToeplitz(int[][] matrixToCheck) {
        for (int i = 0; i < matrixToCheck.length - 1; i++) {
            for (int j = 0; j < matrixToCheck[i].length - 1; j++) {
                if (matrixToCheck[i][j] != matrixToCheck[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
