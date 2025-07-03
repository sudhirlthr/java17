package io.sudhir.log;

public class TestArose {
    public int getMissingNumber(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int n = array.length+1;
        int summation = (n * (n + 1)) / 2;
        return summation-sum;
    }
}
