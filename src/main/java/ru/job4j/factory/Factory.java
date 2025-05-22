package ru.job4j.factory;

public abstract class Factory {
    public void showInfo() {

        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
