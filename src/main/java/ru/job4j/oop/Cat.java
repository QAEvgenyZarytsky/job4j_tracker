package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    void giveNick(String nick) {
        this.name = nick;
    }

    void show() {
        System.out.printf("Name of cat: %s. The cat eats: %s. \n", this.name, this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        gav.giveNick("Blackie");
        black.eat("fish");
        black.show();
    }
}
