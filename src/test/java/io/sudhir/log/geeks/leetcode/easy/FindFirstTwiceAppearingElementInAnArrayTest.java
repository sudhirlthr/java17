package io.sudhir.log.geeks.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstTwiceAppearingElementInAnArrayTest {

    String[] input = {"abccbaacz","abcdd"};
    Character[] expectedOutput = {'c', 'd'};

    FindFirstTwiceAppearingElementInAnArray instance = new FindFirstTwiceAppearingElementInAnArray();

    @Test
    void getFirstTwiceRepeatingCharacter() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.getFirstTwiceRepeatingCharacter(input[i]));
        }
    }

    @Test
    void getFirstTwiceRepeatingCharacterOptimal() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expectedOutput[i], instance.getFirstTwiceRepeatingCharacterOptimal(input[i], 2));
        }
    }
}