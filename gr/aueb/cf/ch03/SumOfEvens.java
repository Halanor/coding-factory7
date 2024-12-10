package gr.aueb.cf.ch03;

import java.util.Scanner;

/**
 * Calculates the sum of even numbers from 2 up to the input of the user.
 */
public class SumOfEvens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Insert upper limit");
        inputNum = in.nextInt();

        while (i <= inputNum) {
            sum += i;
            i += 2;
        }
        System.out.println("The sum of even numbers up to " + inputNum + " is: " + sum);
    }
}
