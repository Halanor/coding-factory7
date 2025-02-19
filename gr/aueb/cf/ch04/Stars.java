package gr.aueb.cf.ch04;

/**
 * Prints different outputs of stars.
 */

public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        // Ascending
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        // Descending
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
