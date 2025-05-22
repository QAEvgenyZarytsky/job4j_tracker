package ru.job4j.coffe;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", молоко";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.5; // стоимость молока
    }
}
