package io.sudhir.log.ctci.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestContiguousSumOfSubArray_KadaneAlgorithmTest {

    LargestContiguousSumOfSubArray_KadaneAlgorithm instance = new LargestContiguousSumOfSubArray_KadaneAlgorithm();
    int[][] input = {
            {2, 3, -8, 7, -1, 2, 3},
            {-2, -4},
            {5, 4, 1, 7, 8}
    };
    int[] output = {11, -2, 25};
    @Test
    void findLargestContiguousSumOfSubArray() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(output[i], instance.findLargestContiguousSumOfSubArray(input[i]));
        }
    }

    @Test
    void findLargestContiguousSumOfSubArray_Kadane() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(output[i], instance.findLargestContiguousSumOfSubArray_Optimal_Kadane(input[i]));
        }
    }
}