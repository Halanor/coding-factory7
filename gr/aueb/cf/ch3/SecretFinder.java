package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπαρχει ενας SECRET και ο χρηστης με μια μονο προσπαθεια θα προσπαθησει να τον βρει
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret number found!");
        } else {
            System.out.println("Secret number not found, try again!");
        }
    }
}

