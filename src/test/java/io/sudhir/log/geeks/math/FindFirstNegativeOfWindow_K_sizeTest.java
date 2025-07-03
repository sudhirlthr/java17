package io.sudhir.log.geeks.math;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstNegativeOfWindow_K_sizeTest {

    private int[][] input = {
            {-11, -2, 19, 35, 42, -18},
            {-8, 2, 3, -6, 10},
            {12, -1, -7, 8, -15, 30, 16, 28}
    };
    private int[] size = {3,2,3};

    private int[][] expectedOutput = {
            {-11, -2, 0, -18},
            {-8, 0, -6, -6},
            {-1, -1, -7, -15, -15, 0}
    };

    private FindFirstNegativeOfWindow_K_size instance = new FindFirstNegativeOfWindow_K_size();

    @Test
    void findFirstNegativeElementOfSize_k_window() {
        for (int i = 0; i < input.length; i++) {
            List<Integer> result = instance.findFirstNegativeElementOfSize_k_window(input[i], size[i]);
            for (int j = 0; j < expectedOutput.length; j++) {
                assertEquals(expectedOutput[i][j], result.get(j));
            }
        }
    }
}