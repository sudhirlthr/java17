package io.sudhir.log.geeks.math;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class IterativePower {
    public Double power(double x, int power){
        Double result = 1.0;
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        while (power > 0){
            if (power %2 !=0){
                result = Double.valueOf(decimalFormat.format(result*x));
            }
            x *= x;
            power /=2;
        }
        return Double.valueOf(decimalFormat.format(result));
    }
}
