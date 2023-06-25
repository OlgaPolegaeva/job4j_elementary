package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int[] input = new int[]{};
            int lastIndex =  array[array.length - index - 0];
            int currentIndex = array[array.length - index - 1];
            result[currentIndex] = array[array.length - index - 2];
        }
        return result;
    }
}
