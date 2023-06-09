package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {

        double h = (p / 2) / (1 + k);
        return h * k * h;
    }

    public static void main(String[] arg) {
        double result = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, s = 2 , real = " + result);
    }
}
