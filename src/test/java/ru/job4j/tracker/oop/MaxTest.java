package ru.job4j.tracker.oop;

import org.junit.jupiter.api.Test;
import ru.job4j.oop.Max;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenA2B4C6D8Then8() {
        Max max = new Max();
        int actualResult = max.getMaxNumber(2, 4, 6, 8);
        int expectedResult = 8;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void whenAMinus1B4Then4() {
        Max max = new Max();
        int actualResult = max.getMaxNumber(-1, 4);
        int expectedResult = 4;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void whenAMinus10B14C0Then14() {
        Max max = new Max();
        int actualResult = max.getMaxNumber(-10, 14, 0);
        int expectedResult = 14;
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
