package io.sudhir.log.jdk8.stream.functional;

public class MainClass {
    public static void main(String[] args) {
        Decider<String, Boolean> decider = source -> Boolean.parseBoolean(source);

        System.out.println(decider.decide("TRUE"));
        System.out.println(decider.decide("FALSE"));
        System.out.println(decider.decide("tRuE"));
        System.out.println(decider.decide("No"));

        Decider<Boolean, Integer> decider2 = source -> source ? 1:0;
        System.out.println(decider2.decide(Boolean.TRUE));
        System.out.println(decider2.decide(Boolean.FALSE));
    }
}
