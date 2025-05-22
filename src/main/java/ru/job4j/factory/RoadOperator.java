package ru.job4j.factory;

public class RoadOperator extends Factory {
    @Override
    public Transport createTransport() {
        System.out.println("Create new Truck!");
        return new Truck();
    }
}
