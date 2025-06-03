package ru.job4j.function;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenQuadraticFunctionThenThenQuadraticResults() {
        FunctionCalculator functionCalculator = new FunctionCalculator();
        List<Double> actualResult = functionCalculator.diapason(1, 5, (x) -> 2 * x * x + 3 * x + 1);
        List<Double> expected = Arrays.asList(6D, 15D, 28D, 45D);
        assertThat(actualResult).containsAll(expected);
    }

    @Test
    void whenExponentialFunctionThenExponentialResult() {
        FunctionCalculator functionCalculator = new FunctionCalculator();
        List<Double> actualResult = functionCalculator.diapason(1, 6, (x) -> Math.pow(5, x));
        List<Double> expected = Arrays.asList(5D, 25D, 125D, 625D, 3125D);
        assertThat(actualResult).containsAll(expected);
    }
}