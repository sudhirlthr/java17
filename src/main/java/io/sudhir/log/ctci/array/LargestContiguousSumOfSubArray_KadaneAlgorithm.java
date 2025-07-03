package io.sudhir.log.ctci.array;

public class LargestContiguousSumOfSubArray_KadaneAlgorithm {
    public long findLargestContiguousSumOfSubArray(int[] arr){
        // {2, 3, -8, 7, -1, 2, 3}
        long sum = arr[0];
        int leftIndex= 0, rightIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            long tempSum = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum += arr[j];
            }
            sum = Math.max(sum, tempSum);
        }
        return sum;
    }

    public long findLargestContiguousSumOfSubArray_Optimal_Kadane(int[] arr){
        // {2, 3, -8, 7, -1, 2, 3}
        long sum = arr[0];
        long currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(currentMax+arr[i], arr[i]);
            sum = Math.max(sum, currentMax);
        }
        return sum;
    }
}
