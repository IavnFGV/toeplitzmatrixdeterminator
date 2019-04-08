package com.drozda.dailycodingproblem.toeplitzmatrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckerTest {

    Checker checker = new Checker();

    @Test
    void shouldReturnTrue() {
        int[][] matrix = {
                {1, 2, 3, 4, 8},
                {5, 1, 2, 3, 4},
                {4, 5, 1, 2, 3},
                {7, 4, 5, 1, 2}
        };

        Assertions.assertTrue(checker.isToeplitz(matrix));
    }

    @Test
    void shouldReturnFalse() {
        int[][] matrix = {
                {1, 2, 3, 4, 8},
                {5, 1, 2, 3, 4},
                {4, 5, 1, 2, 3},
                {7, 4, 5, 1,
                        //
                        6}
                        //
        };

        Assertions.assertFalse(checker.isToeplitz(matrix));
    }

}