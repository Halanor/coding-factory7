package gr.aueb.cf.ch2;

/*
 * Convert years (ages) to days.
 */

import java.util.Scanner;

public class YearsToDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        System.out.println("Please insert your age");
        age = scanner.nextInt();

        age = age * DAYS_PER_YEAR;
        System.out.println("Age in years: " + age + ", Age om days: " + days);
    }
}
