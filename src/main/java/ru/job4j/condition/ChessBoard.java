package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
                rsl = 0;
            }

            if (x1 > 7 || x2 > 7 || y1 > 7 || y2 > 7) {
                rsl = 0;
            }

            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = 0;
            }

            return Math.abs(x2 - x1);
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
