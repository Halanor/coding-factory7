package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ExerciseDisektoEtosApp {
    public static void main(String[] args) {

        int year = 0;
        Scanner in = new Scanner(System.in);
        boolean isInt = false;

        System.out.println("Please insert a year");
        year = in.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            isInt = true;
        }

        System.out.println(isInt);
    }
}
