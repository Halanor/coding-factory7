package gr.aueb.cf.ch07;

public class IndexOfSubstringApp {

    public static void main(String[] args) {

        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        int positionoFSecondO = cf.indexOf("o", 2); // θα ξεκινησει απο το 2 και μετα να ψαχνει
        int lastPosotionOfO = cf.lastIndexOf("o");

        String cf2 = cf.substring(1); // oding Factory
        String slice = cf.substring(1, 3); // od

        System.out.println(cf2);
        System.out.println(slice);
    }
}
