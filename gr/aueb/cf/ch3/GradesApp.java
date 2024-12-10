package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης θα δινει:
 * 1. τους συνολικους βαθμους
 * 2. το πληθος των μαθηματων
 * Θα υπολογιζει τον μεσο ορο και θα χαρακτηριζει ως "Αριστα" εαν ο βαθμος ειναι >= 9,
 * "Πολυ καλα" αν ο μεσος ορος ειναι >= 7
 * "Καλος" αν ο μεσος ορος ειναι >= 5
 * "Αποτυχια" αν ο μεσος ορος ειναι < 5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int courseCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or 0");
            System.exit(1);
        }

        System.out.println("Please insert courses count");
        courseCount = scanner.nextInt();

        if (courseCount <= 0) {
            System.out.println("Courses count must not be negative or 0");
            System.exit(1);
        }

        average = totalMarks / courseCount;

        if (average > 10) {
            System.out.println("Error. The average is greater than 10. Please check your input");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7){
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }
    }
}
