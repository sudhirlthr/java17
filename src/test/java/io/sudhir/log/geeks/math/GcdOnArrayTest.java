package io.sudhir.log.geeks.math;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GcdOnArrayTest {
    private int[][] input = {
            {2,5,6,9,10},
            {7,5,6,8,3},
            {3,3},
            {6,7,9}
    };
    private int[] output = {2,1,3,3};
    GcdOnArray gcdOnArray = new GcdOnArray();

    @Test
    void findGCD() {
        for (int i = 0; i < input.length; i++) {
            System.out.println("Test for array: "+ Arrays.toString(input[i]));
            Assertions.assertEquals(gcdOnArray.findGCD(input[i]), output[i]);
        }
    }
}