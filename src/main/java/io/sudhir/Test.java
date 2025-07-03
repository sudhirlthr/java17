package io.sudhir;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] input = {2,3,1,2,4,3};
        int target = 7;
        int ans = new Solution().solution(input, target);
        System.out.print(ans);
    }
}

class Solution {

    public int solution(int[] nums, int target) {
        // write the solution here..
        int l=0, r=nums.length-1, n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        while(n >= 0){
            int rr = r;
            int rem = nums[l] - nums[r];
            while(l < r-1){
                List<Integer> tempList = new ArrayList<>(0);
                if(target == rem){
                    tempList = List.of(nums[l], nums[r]);
                } else if(target == (rem + nums[r-1])){
                    tempList = List.of((Integer)nums[l], (Integer)nums[r], (Integer)nums[r-1]);
                }
                if(tempList.size() > 0) list.add(tempList);
                r--;
            }
            r = rr-1;
            l++;
        }
        System.out.println(list.stream().sorted().findFirst().get().size());
        return 1;
    }
}

/*
* Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
2,2,3 => 2,3,2

Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
*
* */
