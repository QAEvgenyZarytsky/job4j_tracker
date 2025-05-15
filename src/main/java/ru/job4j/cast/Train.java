package ru.job4j.cast;

import java.util.Random;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train travels on the railway");
    }

    @Override
    public void getCurrentSpeed() {
        System.out.println("Текущая скорость: " + new Random().nextInt(80, 130));
    }

}
