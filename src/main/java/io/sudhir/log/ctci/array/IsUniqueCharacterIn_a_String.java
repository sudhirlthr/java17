package io.sudhir.log.ctci.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsUniqueCharacterIn_a_String {
    public boolean isUniqueCharacterIn_a_GivenString_1(String str){
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (characterSet.contains(str.charAt(i))) return false;
            else characterSet.add(str.charAt(i));
        }
        return true;
    }

    public boolean isUniqueCharacterIn_a_GivenString_2(String str){
        Map<Character, Integer> characterSet = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (characterSet.containsKey(str.charAt(i))) return false;
            else characterSet.put(str.charAt(i), 1);
        }
        return true;
    }

    public boolean isUniqueCharacterIn_a_GivenString_3(String str){
        boolean[] array = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (array[ch]) return false;
            else array[ch]=true;
        }
        return true;
    }
}
