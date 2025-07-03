package io.sudhir.log.geeks.leetcode.easy;

public class SubSequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        if (s.length() == 0 && t.length() == 0) return true;
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;

        for (char c: t.toCharArray()){
            if (i <s.length() && s.charAt(i) == c) i++;
        }
        return i==s.length();
    }
}
