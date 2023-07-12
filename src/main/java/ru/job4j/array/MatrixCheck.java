package ru.job4j.array;

import ru.job4j.Main;

import static sun.net.www.http.KeepAliveCache.result;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isFalse(char[][] arr) {
        for (int i = 0; i < arr[i].length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (' ' == (arr[i][j])) {
                    return false;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] arr = {{'X', ' ', 'X'}, {'X', 'X', 'X'}};
        boolean res = Main.isFalse(arr);
        System.out.println(res);
    }
}
