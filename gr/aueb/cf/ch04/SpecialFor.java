package gr.aueb.cf.ch04;

/**
 * Special type of for.
 */

public class SpecialFor {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 1; i++) {
            System.out.println("Once\n");
        }

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + ", " + j);
        }

        for (;;) {
            System.out.println("For ever");
            count++;
            if (count == 10) break;
        }
    }
}