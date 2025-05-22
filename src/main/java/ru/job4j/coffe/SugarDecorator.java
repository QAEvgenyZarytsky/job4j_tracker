package ru.job4j.coffe;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", сахар";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5; // стоимость сахара
    }
}
