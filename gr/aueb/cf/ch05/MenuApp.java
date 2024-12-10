package gr.aueb.cf.ch05;

import java.util.Scanner;

/**
 * Prints a menu with options and the user chooses an option.
 * Then it executes a task depending on the option.
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid.");
                continue;
            }
            doOnChoice(choice);
            // break to stop menu from showing again
        } while (choice != 5);

    }

    public static void printMenu () {
        System.out.println("Choose of the the following");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Insert");
                break;
            case 2:
                System.out.println("2. Delete");
                break;
            case 3:
                System.out.println("3. Search");
                break;
            case 4:
                System.out.println("4. Update");
                break;
            case 5:
                System.out.println("5. Exit");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
