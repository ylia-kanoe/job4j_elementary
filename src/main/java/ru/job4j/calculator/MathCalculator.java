package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndQuot(double first, double second) {
        return dif(first, second)
                + quot(first, second);
    }

    public static double sumAndMultiplyAndDifAndQuot(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + dif(first, second)
                + quot(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета функции sumAndMultiply: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета функции difAndQuot: " + difAndQuot(10, 20));
        System.out.println("Результат расчета функции sumAndMultiplyAndDifAndQuot: " + sumAndMultiplyAndDifAndQuot(10, 20));

    }
}
