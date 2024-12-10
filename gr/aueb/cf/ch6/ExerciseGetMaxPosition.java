package gr.aueb.cf.ch6;

public class ExerciseGetMaxPosition {

    public static void main(String[] args) {

        int[]arr = {8, 3, 4, 5, 7, 10};
    }

    public static int getMaxPosition (int[] arr, int low, int high) {

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
