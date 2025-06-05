package ru.job4j.lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a",  "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("Начало блока \"лямды\"");
            System.out.println("Используем Integer.compare для сравнения длинны");
            System.out.println("Сравниваем строки: " + left + " : " + right);
            System.out.println("Сортировка строк по длинне - " + left.length() + " : " + right.length());
            System.out.println("В return передаём:  Integer.compare(right.length(), left.length());");
            return Integer.compare(right.length(), left.length());
        };
        strings.sort(comparator);
        for (String string : strings) {
            System.out.println(string);
        }

    }
}