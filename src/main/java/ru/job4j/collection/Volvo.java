package ru.job4j.collection;

public class Volvo implements Car {
    String model;

    Volvo(String model) {
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
        System.out.println("Машина Volvo " + getModel() + " движется");
    }

    @Override
    public String toString() {
        return "Volvo{"
                + "model='" + model + '\''
                + '}';
    }
}
