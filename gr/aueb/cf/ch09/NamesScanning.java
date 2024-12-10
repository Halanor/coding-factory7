package gr.aueb.cf.ch09;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβαζει απο ενα αρχειο δεδομενα
 */
public class NamesScanning {

    public static void main(String[] args) {
        String inFilePath = "C:\\Users\\Christopher\\Documents\\Coding factory\\Java\\names.txt";
        String outFilePath = "C:\\Users\\Christopher\\Documents\\Coding factory\\Java\\names-formated.txt";
        String line;
        String[] tokens;


        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
//                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\", \n }", tokens[0], tokens[1], tokens[2]);
                printFormated(ps, tokens);
                printFormated(System.out, tokens);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printFormated(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);

    }
}
