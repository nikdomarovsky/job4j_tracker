package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int munis(int b) {
        return b - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int b) {
        return sum(b) + multiply(b) + munis(b) + divide(b);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        Calculator calculator = new Calculator();
        int resultmultiply = calculator.multiply(5);
        int resultmunis = munis(10);
        int resultdivide = calculator.divide(10);
        int resultsumAllOperation = calculator.sumAllOperation(10);
        System.out.println(result);
        System.out.println(resultmultiply);
        System.out.println(resultmultiply);
        System.out.println(resultmunis);
        System.out.println(resultdivide);
        System.out.println(resultsumAllOperation);
    }
}