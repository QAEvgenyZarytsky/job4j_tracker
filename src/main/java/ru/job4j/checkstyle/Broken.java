package ru.job4j.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    private int emptySize = 10;
    public String surname;
    String name;

    Broken() { }

    void echo() { }

    void method(int a, int b, int c, int d) { }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}