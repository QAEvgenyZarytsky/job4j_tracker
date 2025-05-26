package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<Car> autos = new HashSet<>();
        autos.add(new Lada(2107));
        autos.add(new BMW("X5"));
        autos.add(new Volvo("S60"));
        autos.add(new Toyota("Camry"));

        for (Car car : autos) {
            System.out.println(car.getClass().getSimpleName());
            System.out.println(car.toString());
            car.carRun();
            System.out.println();
        }
    }
}
