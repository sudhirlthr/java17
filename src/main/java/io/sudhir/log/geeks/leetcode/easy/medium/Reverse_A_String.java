package io.sudhir.log.geeks.leetcode.easy.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse_A_String {
    public String reverseWords(String s) {
        String[] str = Arrays.stream(s.split("\\s+")).filter(ele -> !ele.trim().isEmpty()).toList().toArray(new String[0]);
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].isEmpty()){
                if(i==0) sb.append(str[i].trim());
                else sb.append(str[i].trim()).append(" ");
            }
        }
        return sb.toString();
    }
}
