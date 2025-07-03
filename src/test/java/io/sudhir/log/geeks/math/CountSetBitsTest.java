package io.sudhir.log.geeks.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSetBitsTest {

    private int[] input = { 6, 13, 12};
    private int[] expectedOutput = { 2, 3,2};

    private CountSetBits instance = new CountSetBits();
    @Test
    void countSetBit() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.countSetBit(input[i]));
        }
    }
}