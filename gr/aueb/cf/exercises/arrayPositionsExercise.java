package gr.aueb.cf.exercises;

public class arrayPositionsExercise {

    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 8, 10, 0};
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

    public static int getMinPosition(int [] arr) {

        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
//        return minPosition;
        return minValue;
    }
}
