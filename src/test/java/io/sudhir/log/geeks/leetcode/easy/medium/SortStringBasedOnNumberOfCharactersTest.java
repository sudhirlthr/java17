package io.sudhir.log.geeks.leetcode.easy.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStringBasedOnNumberOfCharactersTest {

    SortStringBasedOnNumberOfCharacters instance = new SortStringBasedOnNumberOfCharacters();

    String[] input = {
          "tree",
          "cccaaa",
          "Aabb"
    };

    String[] expected = {
            "eert",
            "aaaccc",
            "bbAa"
    };

    @Test
    void frequencySort() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], instance.frequencySort(input[i]));
        }
    }


    @Test
    void frequencySortUsingPriorityQueue() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], instance.frequencySortsUsingPriorityQueue(input[i]));
        }
    }
    @Test
    void sortOnFrequency() {
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], instance.sortOnFrequency(input[i]));
        }
    }
}