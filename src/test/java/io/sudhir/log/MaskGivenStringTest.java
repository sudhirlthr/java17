package io.sudhir.log;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaskGivenStringTest {

    MaskGivenString instance = new MaskGivenString();

    List<String> givenList = List.of("Sudhir", "Sadhu", "Google");
    String[] givenString = {
            "This is Sudhir and SAdhu. sudhir and sadhu are friends",
            "Hey I want to work for Google, and google is foogle"
    };

    String[]  outputExpected = {
            "This is S****r and S***u. s****r and s***u are friends",
            "Hey I want to work for G****e, and g****e is foogle"
    };


    @Test
    void maskGivenString() {
        for (int i = 0; i < givenString.length; i++) {
            assertEquals(outputExpected[i], instance.maskGivenString(givenString[i], givenList));
        }
    }
}