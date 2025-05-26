package ru.job4j.collection;

public class Lada implements Car {
    int model;

    Lada(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public void carRun() {
        System.out.println("Машина LADA " + getModel() + " движется");
    }

    @Override
    public String toString() {
        return "Lada{"
                + "model=" + model
                + '}';
    }
}
