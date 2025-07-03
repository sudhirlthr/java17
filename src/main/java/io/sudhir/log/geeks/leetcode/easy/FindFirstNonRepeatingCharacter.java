package io.sudhir.log.geeks.leetcode.easy;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(new FindFirstNonRepeatingCharacter().firstUniqChar("aabbc"));
        System.out.println(new FindFirstNonRepeatingCharacter().firstUniqueChar_optimized("aabbc"));
    }
    // find index of first non-repeating character
    public int firstUniqChar(String s) {
       Optional<Character> firstNonRepeatingCharacter =
               s.chars().mapToObj(c -> (char) c)
                       .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                       .entrySet()
                       .stream()
                       .filter(entry -> entry.getValue()==1).map(Map.Entry::getKey).findFirst();
       return firstNonRepeatingCharacter.map(s::indexOf).orElse(-1);
    }

    public int firstUniqueChar_optimized(String s) {
        // bcoz String would gave only 26 character that either repeat or dont repeat
        int[] arr = new int[26];
        char[] charArray = s.toCharArray();
        for (char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for (char c: s.toCharArray()){
            if (arr[c-'a'] == 1) return s.indexOf(c);
        }
        return -1;
    }
}
