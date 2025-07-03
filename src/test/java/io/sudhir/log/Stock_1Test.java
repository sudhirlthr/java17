package io.sudhir.log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stock_1Test {

    int[][] inputTests = {
            {7,1,5,3,6,4},
            {7,6,4,3,1}
    };
    int[] expectedOutput = {5, 0};

    Stock_1 instance = new Stock_1();

    @Test
    void getHighestProfit() {
        for (int i = 0; i < inputTests.length; i++) {
            assertEquals(expectedOutput[i], instance.getHighestProfit(inputTests[i]));
        }
    }
}