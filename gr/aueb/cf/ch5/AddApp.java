package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculate the sum of two integers
 * using methods
 */

public class AddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please enter two integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = add(num1, num2);
        sub = sub(num1, num2);

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     * Adds two integers.
     * @param a the first integer.
     * @param b the second integer.
     * @return the sum of the two integers.
     */

    public static int add(int a, int b) {
//        int result = 0;
//        result = a + b;
        System.out.println("Hello");
        return a + b;
    }

    /**
     * Substracts two integers.
     * @param a the first integer.
     * @param b the second integer.
     * @return the sub of the two integers.
     */

    public static int sub (int a, int b) {
        return a - b;
    }

}
