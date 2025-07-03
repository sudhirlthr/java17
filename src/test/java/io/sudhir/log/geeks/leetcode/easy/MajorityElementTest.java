package io.sudhir.log.geeks.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    MajorityElement instance = new MajorityElement();

    int[][] input = {
            {3,2,3},
            {2,2,1,1,1,2,2}
    };
    int[] expectedOutput = {
            3,
            2
    };

    @Test
    void majorityElement() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.majorityElement(input[i]));
        }
    }

    @Test
    void majorityElement_Optimized() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.majorityElement(input[i]));
        }
    }
}