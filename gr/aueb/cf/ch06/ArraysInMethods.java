package gr.aueb.cf.ch06;

/**
 * Demo with arrays and methods
 */
public class ArraysInMethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3 , 4, 5};
        printArray(arr);

        printArray(arr, 0, arr.length - 1);
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }

    /**
     * Overloaded version of print array. Prints the elements of the arr from low to high.
     * @param arr the input array
     * @param low the start array
     * @param high the end index
     */
    public static void  printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length - 1) {
            return;
        }

        for (int i = low; i <= high; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
