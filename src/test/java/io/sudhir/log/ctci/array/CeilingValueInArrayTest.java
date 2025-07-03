package io.sudhir.log.ctci.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeilingValueInArrayTest {

    int[][] input = {
            {2, 8, 30, 15, 25, 12},
            {10, 20, 30},
            {30, 20, 10},
            {6, 18, 4, 5}
    };
    int[][] output = {
            {-1,-1, -1,30,30,15},
            {-1, -1, -1},
            {-1, 30, 20},
            {-1, -1, 6, 6}
    };
    CeilingValueInArray instance = new CeilingValueInArray();
    @Test
    void findAllCeilingValueOfGivenArrayElements() {
        for (int i = 0; i < input.length; i++) {
            assertArrayEquals(output[i], instance.findAllCeilingValueOfGivenArrayElements(input[i]));
        }
    }
}