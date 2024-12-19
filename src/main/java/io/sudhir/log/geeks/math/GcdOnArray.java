package io.sudhir.log.geeks.math;

import java.util.Arrays;

public class GcdOnArray {
    public int findGCD(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        if (min == max) return min;

        int gcd = 1;
        for (int i = 1; i <= nums.length; i++) {
            if (min%i == 0 && max%i == 0) gcd = Math.max(gcd, i);
        }
        return gcd;
    }
}
