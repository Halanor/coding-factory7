package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * Calculates the price with vat.
 */
public class PriceWithVat {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final double VAT = 1.24;
        double priceNoVat = 0;
        double priceWithVat = 0;

        System.out.println("Please insert the price");
        priceNoVat = in.nextDouble();
        priceWithVat = priceNoVat * VAT;

        System.out.println("The price with VAT is: " + priceWithVat);
    }
}
