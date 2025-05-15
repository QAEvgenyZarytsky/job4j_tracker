package ru.job4j.cast;

import java.util.Random;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Plane flies through the air");
    }

    @Override
    public void getCurrentSpeed() {
        System.out.println("Текущая скорость: " + new Random().nextInt(880, 980));
    }

}
