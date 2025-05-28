package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("test@gmail.com", "Ivanov Ivan");
        map.put("test1@gmail.com", "Neo Matrixx");
        map.put("test2@gmail.com", "Shrek Oreo");
        map.put("test3@gmail.com", "Kot Off");
        map.put("test@gmail.com", "Ivanov Update");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey());
            System.out.println("value = " + entry.getValue());
        }
    }
}
