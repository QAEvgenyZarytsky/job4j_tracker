package ru.job4j.enumeration;

public class WatherService {
    public static void main(String[] args) {
        for (WeekDay day : WeekDay.values()) {
            System.out.println("Имя: " + day.name() + " индекс: " + day.ordinal());
            System.out.println(day.getInfo() + " | " + day.getMessage());
        }
    }
}
