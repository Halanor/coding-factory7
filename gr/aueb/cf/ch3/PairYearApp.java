package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Take a year and return if it is dividable by 4
 */
public class PairYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select one of the following: ");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("3. Search");
            System.out.println("3. Exit");
            choice = in.nextInt();
        } while (choice != 3);

        System.out.println("Thank for using the menu app");
    }
}
