package io.sudhir.log.geeks.leetcode.easy.medium;

import java.util.*;
import java.util.stream.Collectors;

public class SortStringBasedOnNumberOfCharacters {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else map.put(c, 1);
        }
        Comparator<Map.Entry<Character, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);
        Map<Character, Integer> sortedMap = map.entrySet().stream().sorted(comparator.reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry: sortedMap.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            sb.append(String.valueOf(key).repeat(Math.max(0, value)));
        }
        return sb.toString();
    }

    public String frequencySortsUsingPriorityQueue (String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else map.put(c, 1);
        }
        Comparator<Map.Entry<Character, Integer>> comparator = (o1, o2) -> o1.getValue().compareTo(o2.getValue());
        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>(comparator.reversed());
        queue.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()){
            Map.Entry<Character, Integer> poll = queue.poll();
            sb.append(String.valueOf(poll.getKey()).repeat(poll.getValue()));
        }
        return sb.toString();
    }
     public String sortOnFrequency(String str){
        int[] arr = new int[256];
        StringBuilder sb = new StringBuilder();
        int index = 0, max = Integer.MIN_VALUE;
         for (int i = 0; i < str.length(); i++) {
             arr[str.charAt(i)]++;
         }
         while (true){
             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] > max){
                     max = arr[i];
                     index = i;
                 }
             }
             if (max == 0) break;
             while (max > 0){
                 sb.append((char) index);
                 max--;
                 arr[index]--;
             }
         }
         return sb.toString();
     }


}
