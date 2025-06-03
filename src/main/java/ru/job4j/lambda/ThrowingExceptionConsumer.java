package ru.job4j.lambda;

public interface ThrowingExceptionConsumer<T, E extends Exception> {
    void accept(T t) throws E;
}

