package ru.job4j.oop;

public class Ball {
    void tryRun(boolean condition) {
        if (condition) {
            System.out.println("The ball is eaten!");
        } else {
            System.out.println("The ball has escaped!");
        }
    }
}
