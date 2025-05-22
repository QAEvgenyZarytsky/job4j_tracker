package ru.job4j.coffe;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Простой кофе";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
