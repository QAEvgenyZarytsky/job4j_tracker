package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        sportCar.refill();
        Vehicle.getDragCoefficient();
        Vehicle t1 = new SportCar();
        t1.chargeBattery();
    }
}
