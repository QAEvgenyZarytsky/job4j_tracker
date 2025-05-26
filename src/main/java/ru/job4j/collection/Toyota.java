package ru.job4j.collection;

public class Toyota implements Car {
    String model;

    Toyota(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void carRun() {
        System.out.println("Машина Toyota " + getModel() + " движется ");
    }

    @Override
    public String toString() {
        return "Toyota{"
                + "model='" + model + '\''
                + '}';
    }
}
