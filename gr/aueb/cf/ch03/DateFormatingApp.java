package gr.aueb.cf.ch03;

import java.util.Scanner;

/*
 * Προγραμμα που διαβαζει απο τον χρηστη 3 ακεραιους αριθμους που
 * αναπαριστουν ημερα, μηνα, ετος και την εμφανιζει σε μορφη
 * ΗΗ/ΜΜ/ΕΕ
 */
public class DateFormatingApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        int day = 0;
        int month = 0;
        int year = 0;
        Scanner in = new Scanner(System.in);
        //Εντολες
        System.out.println("Please insert the day, month and date in the respective order, separated by a space");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        //Εκτυπωση
        System.out.printf("The date is: %02d/%02d/%02d", day, month, year);
    }
}
