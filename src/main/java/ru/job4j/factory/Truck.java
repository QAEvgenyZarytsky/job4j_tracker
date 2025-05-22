package ru.job4j.factory;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck go-go-go!!!");
    }
}
