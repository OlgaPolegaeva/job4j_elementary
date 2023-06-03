package ru.job4j.condition;

public class Game {

    public static void menu(String name) {
        if ("super mario".equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if ("super mario".equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if ("super mario".equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");

    }
}