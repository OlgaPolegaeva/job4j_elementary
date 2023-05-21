package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name + ", age = " + 6 + ".");
        System.out.println("Hello, " + name + ", age = " + 6 + ".");
        System.out.println("Hello, " + name + ", age = " + 6 + ".");
        System.out.println("Hello, " + name + ", age = " + 6 + ".");
    }

    public static void main(String[] arg) {

        String name = "Job4j";
        char age = '6';
        ArgMethod.hello(name);
    }

}
