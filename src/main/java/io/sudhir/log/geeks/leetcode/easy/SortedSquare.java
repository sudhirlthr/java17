package io.sudhir.log.geeks.leetcode.easy;

public class SortedSquare {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int l=0, r=nums.length-1, val = 0;
        for (int i = nums.length-1;i>=0; i--) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])){
                val = nums[l];
                l++;
            } else{
                val = nums[r];
                r--;
            }
            res[i] = val*val;
        }
        return res;
    }
}
