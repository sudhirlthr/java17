package io.sudhir.log.geeks.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedArrayTest {

    MergeTwoSortedArray instance = new MergeTwoSortedArray();
    int[][][] input = {
            {{1, 2, 3, 0, 0, 0}, {2, 5, 6}},
            {{1}, {}},
            {{}, {1}}
    };
    int[][] expectedOutput = {{1, 2, 2, 3, 5, 6}, {1}, {1}};

    @Test
    void merge() {
        instance.merge(input[0][0], 3, input[0][1], 3);
        assertArrayEquals(expectedOutput[0], input[0][0]);
    }

    @Test
    void merge2() {
        instance.merge(input[1][0], 1, input[1][1], 0);
        assertArrayEquals(expectedOutput[1], input[1][0]);
    }

    @Test
    void merge3() {
        instance.merge(input[2][0], 0, input[2][1], 1);
        assertArrayEquals(expectedOutput[2], input[2][0]);
    }
}