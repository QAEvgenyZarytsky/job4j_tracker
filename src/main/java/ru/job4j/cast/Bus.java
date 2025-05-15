package ru.job4j.cast;

import java.util.Random;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus travels along the highway");
    }

    @Override
    public void getCurrentSpeed() {
        System.out.println("Текущая скорость: " + new Random().nextInt(45, 80));
    }
}
