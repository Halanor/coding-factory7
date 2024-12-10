package gr.aueb.cf.ch6;

/**
 * Finds the min and max of an array.
 */

public class ArrayMinAndMax {

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 8, 0};


        for (int el : arr) {
            System.out.println(el + " ");
        }
    }

    public static int getMinPosition(int [] arr) {

        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int [] arr) {

        if (arr == null || arr.length <1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
