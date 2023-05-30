package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;

    }

    public static void main(String[] arg) {
        float in = 140;
        float expectedEuro = 2f;
        float expectedDollar = 2f;

        float euro = Converter.rubleToEuro(in);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(in);
        System.out.println("140 rubles are " + dollar + " dollar.");

        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;

        System.out.println(passedEuro);
        System.out.println(passedDollar);
    }

}

