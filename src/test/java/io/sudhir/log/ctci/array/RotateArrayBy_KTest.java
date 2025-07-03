package io.sudhir.log.ctci.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayBy_KTest {

    int[][] input = {
            {1,2,3,4,5,6,7},
            {-1, -100, 3, 99},
            {1,2}
    };

    int[] k = {3, 2, 3};

    int[][] expectedOutput = {
            {5,6,7, 1,2,3,4},
            {3, 99, -1, -100},
            {2,1}
    };

    RotateArrayBy_K instance = new RotateArrayBy_K();


    @Test
    void rotateArray() {
        for (int i = 0; i < input.length; i++) {
            instance.rotateArray(input[i], k[i]);
            assertArrayEquals(expectedOutput[i], input[i]);
        }
    }
}