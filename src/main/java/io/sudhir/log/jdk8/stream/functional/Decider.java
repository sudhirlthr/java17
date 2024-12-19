package io.sudhir.log.jdk8.stream.functional;

@FunctionalInterface
public interface Decider<T, R> {
    R decide(T source);
}
