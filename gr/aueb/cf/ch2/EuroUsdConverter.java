package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        int euro = 0;
//        int rate = 0.99;
        int dollar = 0;
        Scanner in = new Scanner(System.in);

        // Εντολες
        System.out.println("Please insert amount in Euro");
        euro = in.nextInt();
        dollar = (euro * 99) / 100;

        //Εκτυπωση
        System.out.printf("Amount in dollars is %d", dollar);
    }
}
