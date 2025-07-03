package io.sudhir.log.geeks.math.string;

import java.util.*;
import java.util.stream.Collectors;

public class Oracle_SortStringBasedOnNumberOfOccurances {

    public String sortUsingMap(String str){
        Map<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (char c: str.toCharArray()) {
            if(characterIntegerHashMap.containsKey(c)) {
                characterIntegerHashMap.put(c, characterIntegerHashMap.get(c)+1);
            } else characterIntegerHashMap.put(c, 1);
        }
        Map<Character, Integer> sortedMapWithValue = sortMapWithValue(characterIntegerHashMap);

        StringBuilder stringBuilder = new StringBuilder();

        sortedMapWithValue.forEach((character, integer) -> {
            int i = integer;
            while (i > 0){
                stringBuilder.append(character);
                i--;
            }
        });
        return stringBuilder.toString();
    }

    private Map<Character, Integer> sortMapWithValue(Map<Character, Integer> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public String sortUsingIntArray(String str){
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        char[] result = new char[str.length()];
        int index2 = 0;
        Integer min = Integer.MAX_VALUE, index = -1;
        for (int i = 97; i < 123; i++) {
            for (int j = i; j < 123; j++) {
                if (arr[j] !=0 && min > arr[j]) {
                    min = arr[j];
                    arr[j] = 0;
                    index = j;
                    break;
                }
            }
            result[index2] = Character.toChars(arr[index]+97)[0];
            index2++;
        }
        return new String(result);
    }
}
