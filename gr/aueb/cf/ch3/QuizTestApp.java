package gr.aueb.cf.ch3;

import java.util.Scanner;
import java.math.MathContext;

public class QuizTestApp {
//    public static void main(String[] args) {
//
//        int[] grades = new int[] {1, 2, 3, 4, 5, 5, 0, 2, 0, 4, 5, 2, 1, 1};
//        int[] counts = new int[6];
//
//        for (int grade : grades) {
//            counts[grade]++;
//        }
//
//        for (int i =0; i < counts.length; i++) {
//            System.out.printf("Grades %d: %.2f%%\n", i, ((double) counts[i] / grades.length) * 100);
//        }
//    }

    public static void main(String[] args) {
        int[][] grid = new int[2][2];

        grid[0][0] = 0;
        grid[0][1] = 1;
        grid[1][0] = 2;
        grid[1][1] = 3;

        for (int[] row : grid) {
            for (int col : row) {
                System.out.printf(col + " ");
            }
            System.out.println();
        }

    }

    public static int odd(int a) {
        return a;
    }
}
