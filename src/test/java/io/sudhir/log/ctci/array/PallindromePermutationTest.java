package io.sudhir.log.ctci.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PallindromePermutationTest {

    PallindromePermutation instance = new PallindromePermutation();
    //String[] inputArray = {"god","baab"};
    String[] inputArray = {"", "tacocat", "dod", "baab", "geeeg", "aab", "carerac", "code", "god"};
    //boolean[] expectedOutput = {false, true};
    boolean[] expectedOutput = {true, true, true, true, true, true, true, false, false};


    String[] inputArrayAlphaNumeric = {"", "A man, a plan, a canal: Panama", "race a car", "0P"};
    //boolean[] expectedOutput = {false, true};
    boolean[] expectedOutputAlphaNumeric = {true, true, false, false};
    @Test
    void isGivenStringPermuationOfPallindrom() {
        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], instance.isGivenStringPermuationOfPallindrom(inputArray[i]));
        }
    }

    @Test
    void isGivenStringPermuationOfPallindrom_forNonAlphanumeric() {
        for (int i = 0; i < inputArrayAlphaNumeric.length; i++) {
            assertEquals(expectedOutputAlphaNumeric[i], instance.isGivenStringPermuationOfPallindrom(inputArrayAlphaNumeric[i]));
        }
    }
}