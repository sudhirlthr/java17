package io.sudhir.log.geeks.leetcode.easy.medium;

import java.util.Arrays;

public class RotateArrayByK {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] lastK_array = Arrays.copyOfRange(nums, k+1, n);
        int kk = k;
        for(int i=n-1;i>=n-k;i--){
            nums[i] = nums[n-kk-1];
            kk--;
        }
        for(int i=0;i<k;i++){
            nums[i] = lastK_array[i];
        }
    }
}
