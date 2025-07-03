package io.sudhir.log.ctci.array;

import java.util.Arrays;

public class RotateArrayBy_K {
    public void rotateArray(int[] nums, int k){
        int n = nums.length;
        int[] lastK_array = Arrays.copyOfRange(nums, 0, n);
        k = k % n;
        int index = k;
        for (int i = n-1; k > 0 ; i--) {
            nums[k-1] = lastK_array[i];
            k--;
        }
        k = index;
        for (int i = 0; i < n-k && index < n; i++) {
            nums[index] = lastK_array[i];
            index++;
        }
    }
}
