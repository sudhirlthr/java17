package io.sudhir.log.geeks.math;

public class CountSetBits {

    public int countSetBit(int n){
        int count = 0;
        System.out.println("Input = "+n+"\n");
        while (n > 0){
            System.out.println(n&1);
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
}
