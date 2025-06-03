package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> result = new ArrayList<>();
        for (int index = start; index < end; index++) {
            result.add(function.apply((double) index));
        }
        return result;
    }

    public static void main(String[] args) {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> result1 = function.diapason(5, 8, x -> 2 * x * x + 3 * x + 1);
        List<Double> result2 = function.diapason(5, 8, x -> Math.pow(3, x));
        int i = 0;
//        List<Double> expected = Arrays.asList(11D, 13D, 15D);

    }
}