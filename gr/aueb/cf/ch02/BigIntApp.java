package gr.aueb.cf.ch02;

import java.math.BigInteger;

/*
 * BigInteger class demo
 */
public class BigIntApp {

    public static void main(String[] args) {
        // Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("123456732467238467324231216");
        BigInteger bigNum2 = new BigInteger("187231283721893173213213122");
        BigInteger result;

        // Commands
        result = bigNum1.add(bigNum2);

        // Printing the results
        System.out.printf("%,d", result);
    }
}
