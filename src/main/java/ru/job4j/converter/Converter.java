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
        float euro = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == euro;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println(passedEuro);

        float expectedDollar = 2.3333333f;
        float dollar = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println(passedDollar);
    }

}

