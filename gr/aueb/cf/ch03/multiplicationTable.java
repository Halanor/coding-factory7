package gr.aueb.cf.ch03;

import java.util.Scanner;

/**
 * Multiplies numbers up to 10.
 */
public class multiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Enter an integer");
        num = scanner.nextInt();

        while (i <= 10) {
//            System.out.println(num + " + " + i + " = " + (num * i));
            System.out.printf("%d + %02d = %2d\n", num, i, num * i);
            i++;
        }
    }
}
