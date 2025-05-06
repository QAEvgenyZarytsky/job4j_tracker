package ru.job4j.oop;

public class Max {
    public int getMaxNumber(int a, int b) {
        return a > b ? a : b;
    }

    public int getMaxNumber(int a, int b, int c) {
        return getMaxNumber(a, getMaxNumber(b, c));
    }

    public int getMaxNumber(int a, int b, int c, int d) {
        return getMaxNumber(a, getMaxNumber(b, c, d));
    }
}
