package io.sudhir.log.geeks.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateNumbers {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[i] = list.get(i);
        }
        return count;
    }

    public int removeDuplicatesOptimized(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
