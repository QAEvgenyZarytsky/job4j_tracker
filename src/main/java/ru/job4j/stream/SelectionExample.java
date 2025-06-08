package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        String result = strings
                .stream()
                .skip(2)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(result);

        List<String> strings1 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        String result1 = strings1
                .stream()
                .skip(5)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(result1);

        List<String> strings2 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        String result2 = strings2
                .stream()
                .skip(strings2.size() - 1)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(result2);
        System.out.println(strings2.size() - 1);
    }
}
