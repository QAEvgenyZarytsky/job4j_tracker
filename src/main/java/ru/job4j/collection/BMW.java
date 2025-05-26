package ru.job4j.collection;

public class BMW implements Car {
    String model;

    BMW(String model) {
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
        System.out.println("Машина BMW " + getModel() + " движется");
    }

    @Override
    public String toString() {
        return "BMW{"
                + "model='" + model + '\''
                + '}';
    }
}
