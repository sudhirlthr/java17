package io.sudhir.log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    int[][] testInput = {
            {1, 2, 4, 6, 3, 7, 8},
            {1, 2, 3, 5},
            {1,2,3,4,5,6,7,9}
    };

    TestArose instance = new TestArose();

    int[] expected = {5, 4, 8};
    @Test
    void getMissingNumber() {
        for (int i = 0; i < testInput.length; i++) {
            assertEquals(expected[i], instance.getMissingNumber(testInput[i]));
        }
    }
}