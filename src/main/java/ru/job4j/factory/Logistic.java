package ru.job4j.factory;

public class Logistic {
    public Factory factory;

    public Logistic(Factory factory) {
        this.factory = factory;
    }

    public void demonstrate() {
        this.factory.showInfo();
    }
}
