package io.sudhir.log.geeks.math;

import java.util.Random;

public class Factorial {
    public static void main(String[] args) {
        Integer number = new Random().nextInt();
        System.out.println("factorial of a number: "+number+", is: "+findFactorialOfA_Number(number));
    }

    private static Integer findFactorialOfA_Number(Integer n){
        return (n == 1 || n == 0) ? 1: n * findFactorialOfA_Number(n-1);
    }
}
