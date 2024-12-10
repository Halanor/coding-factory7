package gr.aueb.cf.ch03;

import java.util.Scanner;

/**
 * Finds the first digit to the left of an integer.
 */
public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int firstDigit = 0;
        int tempNum = 0;

        System.out.println("Enter a positive number");
        inputNum = scanner.nextInt();

        tempNum = inputNum;
        while (tempNum >= 10) {
            tempNum /= 10; // tempNum = tempNum / 10;
        }

        System.out.println("The first digit of " + inputNum + " is: " + tempNum);
    }
}
