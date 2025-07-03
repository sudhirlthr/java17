package io.sudhir.log.geeks.math.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Oracle_SortStringBasedOnNumberOfOccurancesTest {

    Oracle_SortStringBasedOnNumberOfOccurances instance = new Oracle_SortStringBasedOnNumberOfOccurances()
;
    String[] input = {
            "accdddfyffyyyy",
            "bbazzcccyyyyyffff"
    };

    String[] output = {
            "accdddfffyyyyy",
            "abbzzcccffffyyyyy"
    };
    @Test
    void sortUsingMap() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(output[i], instance.sortUsingMap(input[i]));
        }
    }

    @Test
    void sortUsingIntArray() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(output[i], instance.sortUsingIntArray(input[i]));
        }
    }
}