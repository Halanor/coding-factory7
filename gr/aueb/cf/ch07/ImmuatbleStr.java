package gr.aueb.cf.ch07;

public class ImmuatbleStr {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory"; // s1 remains unchangeable.
        s1 = "Athens";  //
    }
}