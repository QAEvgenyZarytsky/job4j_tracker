package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenUseUpperLeftCharInMiddleLessLowerRightChar() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "OnAtext",
                "Onetext"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenMiddleLeftCharGreatRightMiddleChar() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "One",
                "Ona"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenMiddleLeftCharLessRightMiddleChar() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Onatext",
                "Onetext"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftCharIsEmptyIsLessRightChar() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "",
                "One"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenRightCharIsEmptyIsGreatLeftChar() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "One",
                ""
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenRightCharIsEmptyAndLeftCharisEmpty() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "",
                ""
        );
        assertThat(result).isZero();
    }
}
