package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapLambdaUsage {
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "name");
//        map.put(2, "top");
//        map.put(3, "user");
//        map.put(4, "precision");
//        map.put(5, "post");
//
//        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
//
//        System.out.println();
//        System.out.println("after replaceAll");
//        BiFunction<Integer, String, String> function = (key, value) ->  value + "_" + key;
//        map.replaceAll(function);
//        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
//        System.out.println();
//        System.out.println();
//
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "name");
//        map.put(2, "name2");
//        map.put(3, "name3");
//
//        BiFunction<Integer, String, String> function = (key, value) -> value + "_" + key;
//        String result = map.computeIfPresent(1, function);
//
//        System.out.println("Current value: " + result);
//        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
//        System.out.println();
//        System.out.println();
//
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Petr", 5);
//
//        Function<String, Integer> function = String::length;
//        map.computeIfAbsent("Petr", function);
//        map.computeIfAbsent("Pet", function);
//        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
//        System.out.println();
//        System.out.println();
//
//        Map<String, Integer> map = new HashMap<>();
//
//        Function<String, Integer> function = String::length;
//        System.out.println("Result: " + map.computeIfAbsent("Petr", function));
//
//        System.out.println("Result: " + map.computeIfAbsent("Petr", key -> key.length() + 10));
//        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        System.out.println();
        System.out.println();
        Map<String, Integer> map = new HashMap<>();
        map.put("Shoes", 200);
        BiFunction<Integer, Integer, Integer> function = (oldValue, newValue) -> oldValue - newValue;
        int newPrice = map.merge("Shoes", 50, function);
        System.out.println("New price: " + newPrice);
        System.out.println("Price of shirt: " + map.merge("Shirt", 100, function));
        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
    }
}