package gr.aueb.cf.ch03;

/**
 * Calculate the sum and multiplication of first 10 integers
 */
public class SumMul {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10) {
            sum = sum + i;
            i++;
        }

        while (i <= 10) {
            mul *= 1;
            j++;
        }
    }
}
