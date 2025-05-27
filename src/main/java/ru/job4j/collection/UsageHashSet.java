package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        String lada = "Lada";
        String bmw = "BMW";
        String volvo = "Volvo";
        String toyota = "Toyota";

        HashSet<String> autos = new HashSet<>();
        autos.add(lada);
        autos.add(bmw);
        autos.add(volvo);
        autos.add(toyota);

        for (String car : autos) {
            System.out.println(car);
        }
    }
}
