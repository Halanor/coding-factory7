package gr.aueb.cf.ch06;

public class ArrayDeepCopy {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] copied;

        copied = arrDeepCopy(arr);
        for (int el : copied) {
            System.out.println(el + " ");
        }
    }

    /**
     * It creates a fresh copy of an array.
     * @param source  the source array.
     * @return        the copied array.
     */
    public static int[] arrDeepCopy (int[] source) {

        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
//        System.arraycopy(source, 0, destination, 0, source.length);
//        destination = Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }
}
