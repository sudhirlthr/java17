package io.sudhir.log;

public class Stock_1 {
    public int getHighestProfit(int[] stockForAllDay){
        int highestProfit = 0, min = Integer.MAX_VALUE;
        for (int j : stockForAllDay) {
            if (min > j) min = j;
            else if (j - min > highestProfit) highestProfit = j - min;
        }
        return highestProfit;
    }
}
