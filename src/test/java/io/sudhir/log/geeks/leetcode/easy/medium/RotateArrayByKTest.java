package io.sudhir.log.geeks.leetcode.easy.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayByKTest {

    RotateArrayByK instance = new RotateArrayByK();
    int[][] input = {
            {1,2,3,4,5,6,7},
            {-1,-100,3,99}
    };
    int[] rotateBy = {
            3,
            2
    };
    int[][] expected = {
            {5,6,7,1,2,3,4},
            {3,99,-1,-100}
    };
    @Test
    void rotate() {
        for (int i = 0; i < input.length; i++) {
            instance.rotate(input[i], rotateBy[i]);
            assertArrayEquals(expected[i], input[i]);
        }
    }
}