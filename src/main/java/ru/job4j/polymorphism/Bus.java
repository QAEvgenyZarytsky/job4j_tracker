package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Bus moving!");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Number of seats on the bus 54");
    }

    @Override
    public int refuel(int fuel) {
        return (int) (fuel * 3.14);
    }
}
