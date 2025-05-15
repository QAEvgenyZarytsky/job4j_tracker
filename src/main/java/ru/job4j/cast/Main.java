package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] arrayOfVehicle = new Vehicle[] {plane, train, bus};
        for (Vehicle vehicle : arrayOfVehicle) {
            System.out.println(vehicle.getClass().getSimpleName());
            vehicle.move();
            vehicle.getCurrentSpeed();
            System.out.println();
        }
    }
}
