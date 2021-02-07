package serg.homework2_2;

import java.util.*;

public class task1 {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] rotatedColors = new int[SIZE][SIZE];
        while (true) {
            System.out.println("Введите угол для поворота исходной матрицы (90, 180 или 270)," +
                    "\nдля завершения программы введите 'end'");
            Scanner sca = new Scanner(System.in);
            String input = sca.nextLine();
            if (input.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            }
            if (input.equals("90")) {
                rotate90(colors, rotatedColors);
            }
            if (input.equals("180")) {
                rotate180(colors, rotatedColors);
            }
            if (input.equals("270")) {
                rotate270(colors,rotatedColors);
            }
        }
    }

    private static void rotate90(int[][] colors, int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][SIZE - 1 - i] = colors[i][j];
            }
        }
        print(rotatedColors);
    }

    private static void rotate180(int[][] colors, int[][] rotatedColors){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[SIZE-1-i][SIZE-1-j] = colors[i][j];
            }
        }
        print(rotatedColors);
    }

    private static void rotate270(int[][] colors, int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[SIZE-1-j][i] = colors[i][j];
            }
        }
        print(rotatedColors);
    }

    private static void print(int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }
}

