package io.sudhir.log.jdk8.stream.functional.consumer;

@FunctionalInterface
public interface MyConsumer<T> {
    void accept(T t);

    default MyConsumer<T> andThen(MyConsumer<T> consumer){
        return (T t) -> {
          this.accept(t);
            System.out.println("And then");
            consumer.accept(t);
        };
    }
}
