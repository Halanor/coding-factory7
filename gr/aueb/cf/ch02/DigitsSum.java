package gr.aueb.cf.ch02;

import java.util.Scanner;

/*
 * Να λαμβανει ως  input απο τον χρηστη ενα διψηφιο ακεραιο και να υπολογιζει και να
 * εκτυπωνει το αθρισμα των ψηφιων του.
 * Πχ, αν ο χρηστης δωσει τον ακεραιο 15 θα πρεπει το αποτελεσμα να ειναι 1 + 5 = 6
 */
public class DigitsSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum = 0;

        System.out.println("Please insert a two-digit interger");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10; // Με div 10 παιρνουμε το αριστερο ψηφιο
        rightDigit = inputNum % 10; // με mod 10 παιρνουμε το δεξι ψηφιο
        sum = leftDigit + rightDigit;

        System.out.printf("Input number is: %d, Left digit is: %d, Right digit: %d, Sum: %d", inputNum, leftDigit, rightDigit, sum);

    }
}
