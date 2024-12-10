package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
 * Εφαρμογη που λαμβανει μια θερμοκρασια (int) σε Fahrenheit και την μετατρεπει σε Celsius
 */
public class FahrenheitConverterApp {
    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων
        int fahrenheit = 0;
        int celsius = 0;
        Scanner in = new Scanner(System.in);
        // Εντολες
        System.out.println("Please insert a temperature in Fahrenheit");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit-32) / 9;
        // Εκτυπωση
        System.out.printf("The temperature is %d C ", celsius);
    }
}
