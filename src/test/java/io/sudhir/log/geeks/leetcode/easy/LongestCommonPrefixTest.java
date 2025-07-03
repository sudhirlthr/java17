package io.sudhir.log.geeks.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    String[][] input = {
            {"flower","flow","flight"},
            {"dog","racecar","car"},
            {"a"}
    };

    String[] expectedOutput = {
            "fl",
            "",
            "a"
    };
    LongestCommonPrefix instance = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.longestCommonPrefix(input[i]));
        }
    }
}