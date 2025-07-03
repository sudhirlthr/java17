package io.sudhir.log.jdk8.stream.functional.consumer;

public class MyConsumerFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyConsumer<String> eatingMyConsumer = t -> System.out.println("Eating: "+t);
        eatingMyConsumer.accept("Healthy food");

        MyConsumer<String> drinkingMyConsumer = t -> System.out.println("Drinking: "+t);
        drinkingMyConsumer.accept("Healthy drink");

        MyConsumer<String> eatingAndDrinkingMyConsumer = eatingMyConsumer.andThen(drinkingMyConsumer);
        eatingAndDrinkingMyConsumer.accept("Something amazing ");
    }
}
