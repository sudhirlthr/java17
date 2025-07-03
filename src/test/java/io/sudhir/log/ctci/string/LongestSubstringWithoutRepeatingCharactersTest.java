package io.sudhir.log.ctci.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters instance = new LongestSubstringWithoutRepeatingCharacters();

    String[] input = {"abcabcbb", "bbbbb", "pwwkew", " "};
    String[] expectedOutput = {"abc", "b", "wke", " "};
    @Test
    void longestSubstringWithoutRepeatingCharacters() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.longestSubstringWithoutRepeatingCharacters(input[i]));
        }
    }

    @Test
    void longestSubstringWithoutRepeatingCharacters2() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.longestSubstringWithoutRepeatingCharacters2(input[i]));
        }
    }
}