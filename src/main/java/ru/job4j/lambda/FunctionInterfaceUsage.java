package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String For Interface";
        System.out.println(supplier.get());

        System.out.println();

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier1 = () -> new HashSet<>(list);
        Set<String> strings = supplier1.get();
        for (String str : strings) {
            System.out.println(str);
        }

        System.out.println();

        Consumer<String> consumer = (string) -> System.out.println(string);
        consumer.accept(supplier.get());

        System.out.println();

        BiConsumer<String, String> biConsumer = (first, second) -> System.out.println(first + second);
        biConsumer.accept(supplier.get(), " and second string");

        System.out.println();

        List<String> list1 = List.of("one", "two", "three", "one", "two", "three");

        System.out.println();

        Supplier<Set<String>> supplier2 = () -> new HashSet<>(list1);
        BiConsumer<Integer, String> biConsumer1 = (first, second) -> System.out.println(first + second);
        Set<String> stringsSet = supplier2.get();
        int i = 1;
        for (String str : stringsSet) {
            biConsumer1.accept(i++, " is " + str);
        }

        System.out.println();

        Predicate<String> predicate = (string) -> string.isEmpty();
        System.out.println("Empty string: " + predicate.test(""));
        System.out.println("Empty string: " + predicate.test("test"));

        System.out.println();

        BiPredicate<String, Integer> condition = (string, number) -> string.contains(number.toString());
        System.out.println("Строка содержит подстроку: " + condition.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + condition.test("Name", 123));

        System.out.println();

        Function<String, Character> function = (string) -> string.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));

        System.out.println();

        BiFunction<String, Integer, String> biFunction = (string, number) ->
                string.concat(" ").concat(number.toString());
        System.out.println("Результат работы бифункции: " + biFunction.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunction.apply("String number", 12345));

        System.out.println();

        UnaryOperator<StringBuilder> builder = (b) -> b.reverse();
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("tset rof gnirtS")));

        System.out.println();

        BinaryOperator<StringBuilder> builder1 = (first, second) -> first.append(" ").append(second);
        System.out.println(
                "Строка после объединения: " + builder1.apply(
                        new StringBuilder("First str"),
                        new StringBuilder("Second str"))
        );
    }
}