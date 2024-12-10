package gr.aueb.cf.ch06;

/**
 * Δηλωση και αρχικοποιηση ενος πινακα.
 * Populate εναν πινακα
 * - new
 * - unsized init
 * - array init
 */

public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];                      // declare and initialization
        int[] arr2 = { 1, 2, 3, 4, 5 };              // unsized initialization
        int[]arr3;
        arr3 = new int[] { 1, 2, 3, 4, 5,};    //array initializer

        // Populate array
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // Transvere
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // Enhanced for
        for (int el : arr3) {
            System.out.println(el + " ");
        }
    }
}
