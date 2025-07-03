package io.sudhir.log.geeks.leetcode.easy.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reverse_A_StringTest {

    Reverse_A_String instance = new Reverse_A_String();
    String[] input = {
            "the sky is blue",
            "  hello world  ",
            "a good   example",
            " "
    };
    String[] expectedOutput = {
            "blue is sky the",
            "world hello",
            "example good a",
            ""
    };

    @Test
    void reverseWords() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.reverseWords(input[i]));
        }
    }
}