package io.sudhir.log.geeks.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index = 0;
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        while (index < firstString.length() && index < lastString.length()){
            if (firstString.charAt(index) == lastString.charAt(index)) index++;
            else break;
        }
        return firstString.substring(0, index);
    }
}
