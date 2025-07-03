package io.sudhir.log.geeks.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquareTest {

    SortedSquare instance = new SortedSquare();
    int[][] input = {
            {-4, -1, 0, 3, 10},
            {-7 ,-3, 2, 3, 11}
    };

    int[][] output = {
            {0, 1, 9, 16, 100},
            {4, 9, 9, 49, 121}
    };

    @Test
    void sortedSquares() {
        for (int i = 0; i < input.length; i++) {
            assertArrayEquals(output[i], instance.sortedSquares(input[i]));
        }
    }
}