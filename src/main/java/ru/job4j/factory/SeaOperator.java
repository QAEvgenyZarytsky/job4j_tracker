package ru.job4j.factory;

public class SeaOperator extends Factory {
    @Override
    public Transport createTransport() {
        System.out.println("Create new Ship!");
        return new Ship();
    }
}
