package io.sudhir.log.geeks.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativePowerTest {

    private double [][] input = {
            {2.0000, 10},
            {2.10000, 3}
    };
    private Double output [] = {1024.00000, 9.26100};
    IterativePower ip = new IterativePower();

    @Test
    void power() {
        for (int i = 0; i < input.length; i++) {
            Assertions.assertEquals(ip.power(input[i][0], (int) input[i][1]), output[i]);
        }
    }
}