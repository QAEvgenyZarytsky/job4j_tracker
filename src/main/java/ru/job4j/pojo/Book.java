package ru.job4j.pojo;

public class Book {
    private String name;
    private int countStr;

    public Book(int countStr, String name) {
        this.countStr = countStr;
        this.name = name;
    }

    public int getCountStr() {
        return countStr;
    }

    public void setCountStr(int countStr) {
        this.countStr = countStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
