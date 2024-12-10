package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Checks if a person is eligible to vote: age > 18.
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int AGE_ELIGIBILITY = 18;
        int ageInput = 0;
        boolean isEligible = false;

        System.out.println("Please insert your age (integer)");
        ageInput = in.nextInt();
        isEligible = ageInput >= AGE_ELIGIBILITY;

        System.out.printf("Your age is %d, you can vote: %b", ageInput, isEligible);

    }
}
