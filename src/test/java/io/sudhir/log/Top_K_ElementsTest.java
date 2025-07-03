package io.sudhir.log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Top_K_ElementsTest {

    int[][] input = {
            {3, 1, 4, 4, 5, 2, 6, 1},
            {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9}
    };
    int[] k = {2, 4};

    int[][] expected = {
            {4,1},
            {5, 11, 7, 10}
    };

    Top_K_Elements instance = new Top_K_Elements();

    @Test
    void getTop_K_Elements() {
        for (int i = 0; i < input.length; i++) {
            assertArrayEquals(expected[i], instance.getTop_K_Elements(input[i], k[i]));
        }
    }
}