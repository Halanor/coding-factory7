package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num + " is even: " + isEven(num));
        System.out.println(num + " is odd " + isOdd(num));
    }

    public static boolean isEven(int num) {
        Scanner scanner = new Scanner(System.in);
        boolean isEven = false;

        System.out.println("Please insert a number (integer)");
        num = scanner.nextInt();

        // isEven
        isEven = num % 2 == 0;

        return isEven;
    }

    /**
     * Delegation Design Pattern
     * @param num
     * @return
     */
    public static boolean isOdd(int num) {
       return !isEven(num);
    }
}
