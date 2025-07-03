package io.sudhir.log.geeks.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement {

    /*
    * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    *
    * */
    public int majorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        Map<Integer, Integer> sortedMapByValue = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));
        return (int) sortedMapByValue.keySet().toArray()[sortedMapByValue.size()-1];
    }

    public int majorityElement_Optimized(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
