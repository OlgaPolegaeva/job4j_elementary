package ru.job4j.calculator;

import ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double difference(double first, double second) {
        return ru.job4j.math.MathFunction.difference(first, second);
    }

    public static double division(double first, double second) {
        return ru.job4j.math.MathFunction.division(first, second);
    }

        public static double sumDifferenceAndDivision(double first, double second) {
        return ru.job4j.math.MathFunction.difference(first, second)
                + ru.job4j.math.MathFunction.division(first, second);
    }

    public static void main(String[] arg) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + difference(369, 9));
        System.out.println("Результат расчета равен: " + division(369, 9));
        System.out.println("Результат расчета равен: " + sumDifferenceAndDivision(369, 9));
    }
}




