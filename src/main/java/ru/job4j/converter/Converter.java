package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70.0f;
    }

    public static float rubleToDollar(float value) {
        return value / 60.0f;

    }

    public static void main(String[] arg) {
        float in = 140;
        float expectedToEuro = 2f;
        float expectedToDollar  = 140 / 60.0f;
        float outEuro = Converter.rubleToEuro(in);
        float outDollar = Converter.rubleToDollar(in);
        System.out.println("140 rubles are " + outEuro + " euro.");
        System.out.println("140 rubles are " + outDollar + " dollar.");
        boolean passedEuro = expectedToEuro == outEuro;
        boolean passedDollar = expectedToDollar == outDollar;
        System.out.println("140 rubles are 2.  Test  result : " + passedEuro);
        System.out.println("140 rubles are 2.  Test  result : " + passedDollar);
    }

}

