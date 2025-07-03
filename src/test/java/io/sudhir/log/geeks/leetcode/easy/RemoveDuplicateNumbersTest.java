package io.sudhir.log.geeks.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateNumbersTest {

    RemoveDuplicateNumbers instance = new RemoveDuplicateNumbers();

    int[][] input = {
            {1,1,2},
            {0,0,1,1,1,2,2,3,3,4}
    };

    int[] expectedOutput = {2,5};

    @Test
    void removeDuplicates() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.removeDuplicates(input[i]));
        }
    }

    @Test
    void removeDuplicates_Optimized() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.removeDuplicatesOptimized(input[i]));
        }
    }
}