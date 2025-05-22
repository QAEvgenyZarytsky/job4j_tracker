package ru.job4j.factory;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship go go go!");
    }
}
