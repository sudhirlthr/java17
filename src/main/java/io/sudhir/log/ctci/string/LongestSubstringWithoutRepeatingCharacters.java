package io.sudhir.log.ctci.string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters {
    public String longestSubstringWithoutRepeatingCharacters(String str){
        Set<Character> subStrings = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder temp = new StringBuilder();
            for(int j = i; j < str.length();j++){
                if (subStrings.contains(str.charAt(j))) {
                    stringBuilder = stringBuilder.length() < temp.length() ? temp:stringBuilder;
                    subStrings = new HashSet<>();
                    temp = new StringBuilder();
                    break;
                }
                else{
                    temp.append(str.charAt(j));
                    subStrings.add(str.charAt(j));
                }
            }
        }
        return stringBuilder.toString();
    }

    public String longestSubstringWithoutRepeatingCharacters2(String str){
        Set<Character> subStrings = new LinkedHashSet<>();
        String result = "";
        int maxLength = 0, left = 0;
        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            if (!subStrings.contains(c)){
                subStrings.add(c);
                maxLength = Math.max(maxLength, right-left+1);
            } else {
                String collect = subStrings.stream().map(Object::toString).collect(Collectors.joining());
                result = result.length() < collect.length() ? collect:result;
                while (subStrings.contains(c)){
                    subStrings.remove(str.charAt(left));
                    left++;
                }
                collect = subStrings.stream().map(Object::toString).collect(Collectors.joining());
                result = result.length() < collect.length() ? collect:result;
                subStrings.add(c);
            }
        }
        return result;
    }
}
