package gr.aueb.cf.ch07;

public class TaverseWithSubString {

    public static void main(String[] args) {

        String s = "Athens Uni of Econ and Bus";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1));
        }
    }
}