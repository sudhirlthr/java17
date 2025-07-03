package io.sudhir.log.geeks.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubSequenceTest {

    SubSequence instance = new SubSequence();
    String[][] input = {
            {"abc", "ahbgdc"},
            {"axc", "ahbgdc"},
            {"b", "abc"}
    };
    boolean[] expectedOutput = {
            true,
            false,
            true
    };

    @Test
    void isSubsequence() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.isSubsequence(input[i][0], input[i][1]));
        }
    }
}