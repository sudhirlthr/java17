package io.sudhir.log.map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExampleTest {

    MapExample<Character, Integer> mapExampleInstance = new MapExample<>();
    Map<Character, Integer> mapInput = new HashMap<>();
    Map<Character, Integer> mapOutput = new LinkedHashMap<>();

    @BeforeEach
    void setUp() {
        mapInput.put('b', 2);
        mapInput.put('a', 4);
        mapInput.put('c', 3);
        mapInput.put('d', 0);
        mapInput.put('z', 2);
        mapInput.put('f', 5);
        mapInput.put('y', 1);

        mapOutput.put('d', 0);
        mapOutput.put('y', 1);
        mapOutput.put('b', 2);
        mapOutput.put('z', 2);
        mapOutput.put('c', 3);
        mapOutput.put('a', 4);
        mapOutput.put('f', 5);
    }

    @Test
    void sortMapByValue() {
        Map<Character, Integer> characterIntegerMap = mapExampleInstance.sortMapByValue(mapInput);
        assertTrue(isTwoMapsAreEqual(characterIntegerMap, mapOutput));
        characterIntegerMap.put('O', 2);
        mapOutput.put('e', 1);
        assertFalse(isTwoMapsAreEqual(characterIntegerMap, mapOutput));
        mapOutput.remove('e');
    }

    @Test
    void sortMapWithHelpOfList() {
        Map<Character, Integer> characterIntegerMap = mapExampleInstance.sortMapWithHelpOfList(mapInput);
        assertTrue(isTwoMapsAreEqual(characterIntegerMap, mapOutput));
        characterIntegerMap.remove('y');
        assertFalse(isTwoMapsAreEqual(characterIntegerMap, mapOutput));
    }

    @Test
    void sortMapOnReverseOrder() {
        Map<Character, Integer> characterIntegerMap = mapExampleInstance.sortMapOnReverseOrder(mapInput);
        assertTrue(isTwoMapsAreEqual(characterIntegerMap, mapOutput));
        characterIntegerMap.remove('y');
        assertFalse(isTwoMapsAreEqual(characterIntegerMap, mapOutput));
    }

    private boolean isTwoMapsAreEqual(Map<Character, Integer> firstMap, Map<Character, Integer> secondMap){
        if (firstMap == null || secondMap == null) return false;
        else if (firstMap.size() != secondMap.size()) return false;
        else return firstMap.entrySet().stream().allMatch(e -> e.getValue().equals(secondMap.get(e.getKey())));
    }
}