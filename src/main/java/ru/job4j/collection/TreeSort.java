package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(510);
        numbers.add(1231);
        numbers.add(2);
        numbers.add(34);
        numbers.add(537);
        System.out.println(numbers);
    }
}
