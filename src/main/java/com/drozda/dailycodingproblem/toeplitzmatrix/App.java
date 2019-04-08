package com.drozda.dailycodingproblem.toeplitzmatrix;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 8},
                {5, 1, 2, 3, 4},
                {4, 5, 1, 2, 3},
                {7, 4, 5, 1, 2}
        };

        String deepToString = Arrays.deepToString(matrix);
        System.out.println(deepToString
        );
        boolean isToeplitz = new Checker().isToeplitz(matrix);

        System.out.println(isToeplitz ? "is toeplitz" : "is NOT toeplitz");

    }
}
