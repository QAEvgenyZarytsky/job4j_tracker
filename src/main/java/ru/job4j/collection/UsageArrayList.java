package ru.job4j.collection;

import ru.job4j.tracker.SingleTracker;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Petr");
        array.add("Ivan");
        array.add("Stepan");
        for (String str : array) {
            System.out.println(str);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
