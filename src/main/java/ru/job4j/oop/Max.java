package ru.job4j.oop;

public class Max {
    public int getMaxNumber(int a, int b) {
        return a > b ? a : b;
    }

    public int getMaxNumber(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : (b > c ? b : c);
    }

    public int getMaxNumber(int a, int b, int c, int d) {
        return getMaxNumber(a, b, c) > d ? getMaxNumber(a, b, c) : d;
    }
}
