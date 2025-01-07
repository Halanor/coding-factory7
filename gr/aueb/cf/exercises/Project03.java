package gr.aueb.cf.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project03 {

    static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static int[] frequency = new int[26];

    public static void main(String[] args) {

        String fileName = "C:\\Users\\Christopher\\Documents\\Coding factory\\Java\\latin-symbols.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (Character.isWhitespace(c)) {
                        continue; // Skip spaces
                    }
                    inputToFrequency(c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        display();
    }

    public static int charToIndex(char input) {

        for (int i = 0; i < 26; i++) {
            if (input == alphabet[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void inputToFrequency(char input) {

        int index = charToIndex(input);

        if (index > 0) {
            frequency[index] = frequency[index] + 1;
        }
    }

    public static void display() {

        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                System.out.printf("Letter " + alphabet[i] + " was found " + frequency[i] + " times\n");
            }
        }
    }
}
