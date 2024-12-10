package gr.aueb.cf.ch07;

import java.util.Scanner;

/**
 * Μετατρεπει ενα String σε ακεραιο.
 */

public class ParseIntApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert and integer");
        s = in.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);
    }
}
