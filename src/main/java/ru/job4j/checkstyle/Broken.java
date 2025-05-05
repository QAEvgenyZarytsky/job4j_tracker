package ru.job4j.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    private int emptySize = 10;
    private String surname;
    private String name;

    public Broken() { }

    public void echo() { }

    public void method(int a, int b, int c, int d) { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}