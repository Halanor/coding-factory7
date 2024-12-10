package gr.aueb.cf.ch8;

import java.util.Scanner;

public class KyriakosApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        try {
            System.out.println("Did you understand Exceptions? (yes/no)");
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                System.out.println("Already thought so!!");
            } else {
                throw new IllegalArgumentException("I doubt it");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
