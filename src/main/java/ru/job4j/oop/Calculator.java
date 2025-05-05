package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    static public int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + multiply(num) + minus(num) + divide(num);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

        int result1 = new Calculator().multiply(10);
        int result2 = minus(10);
        int result3 = Calculator.minus(10);
        int result4 = new Calculator().divide(10);
        int result5 = new Calculator().sumAllOperation(10);

        System.out.println("multiply: "  + result1);
        System.out.println("minus: " + result2);
        System.out.println("minus: " + result3);
        System.out.println("divide: " + result4);
        System.out.println("sumAllOperation: " + result5);
    }
}
