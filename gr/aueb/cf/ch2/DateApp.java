package gr.aueb.cf.ch2;


public class DateApp {
    public static void main(String[] args) {
        int day = 8;
        int month = 11;
        int year = 2024;

        System.out.println("Η ημερομηνια ειναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η Ημερομηνια ειναι: %02d/%02d/%d", day, month, year);
    }
}
