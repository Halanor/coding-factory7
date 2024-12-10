package gr.aueb.cf.ch7;

/**
 * τα Strings ειναι immutable και δεν επηρεαζει το αντιγραφο της αναφορας.
 * Οποτε εχουμε εγκυρο copy στην αντιγραφη
 */

public class StrCopy {

    public static void main(String[] args) {

        String s1 = "Athens";
        String s2 = s1;
    }
}
