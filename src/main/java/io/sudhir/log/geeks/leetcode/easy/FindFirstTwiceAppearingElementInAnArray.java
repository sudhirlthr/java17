package io.sudhir.log.geeks.leetcode.easy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstTwiceAppearingElementInAnArray {

    public Character getFirstTwiceRepeatingCharacter(String str){
        return str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(mapEntry -> mapEntry.getValue() == 2)
                .findFirst()
                .get().getKey();
    }

    public Character getFirstTwiceRepeatingCharacterOptimal(String str, int k){
        int[] arr = new int[26];
        for (char c: str.toCharArray()) {
            int index = c-'a';
            arr[index]++;
            if (arr[index] == k) return c;
        }
        return 'f';
    }
}
