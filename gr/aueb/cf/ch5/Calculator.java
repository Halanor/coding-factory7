package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανιζει ενα μενου επιλογων (1. Προσθεση,2. Αγαιρεση, ...)
 * Ο χρηστης επιλεγει.
 * Αναλογα την επιλογη εκτελειται η αντιστοιχη πραξη.
 * Και εκτυπωενεται το αποτελεσμα.
 * Εκτελειται επαναληπτικα μεχρι ο χρηστης να επιλεξει εξοδος.
 */
public class Calculator {
    // scanner is outside the methods so all methods can see it.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;

        while (true) {
            printMenu();

            choice = getOneInt();


            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice must be between 1-6. Try again.");
                continue;
            }

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("Choose of the the following");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Mod");
        System.out.println("6. Exit");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;

//        if (choice >= 1 && choice <= 6) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static int getResultOnChoice(int choice) {
        int num1 =0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please insert two integers");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Error on choice. Try again.");
                break;
        }
        return result;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) return 0;

        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) return 0;

        return a % b;
    }
}
