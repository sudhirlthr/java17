package io.sudhir.log.ctci.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueCharacterIn_a_StringTest {

    private IsUniqueCharacterIn_a_String instance = new IsUniqueCharacterIn_a_String();
    String[] strArrayInput = {
            "abcd",
            "ccd",
            "Cracking Coding Interview",
            "PP"
    };
    boolean[] expectedOutput = {true, false, false, false};

    @Test
    void isUniqueCharacterIn_a_GivenString_1() {
        for (int i = 0; i < strArrayInput.length; i++) {
            assertEquals(expectedOutput[i], instance.isUniqueCharacterIn_a_GivenString_1(strArrayInput[i]));
        }
    }

    @Test
    void isUniqueCharacterIn_a_GivenString_2() {
        for (int i = 0; i < strArrayInput.length; i++) {
            assertEquals(expectedOutput[i], instance.isUniqueCharacterIn_a_GivenString_2(strArrayInput[i]));
        }
    }

    @Test
    void isUniqueCharacterIn_a_GivenString_3() {
        for (int i = 0; i < strArrayInput.length; i++) {
            assertEquals(expectedOutput[i], instance.isUniqueCharacterIn_a_GivenString_3(strArrayInput[i]));
        }
    }
}