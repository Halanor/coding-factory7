package gr.aueb.cf.ch09;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:\\Users\\Christopher\\Documents\\Coding factory\\file7.txt");
        File outFd = new File("C:\\Users\\Christopher\\Documents\\Coding factory\\file7-out.txt");
        String line;
        String[] tokens;

        // As long as there is a line, keep running.
        try (Scanner in  = new Scanner(inFd);
        PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8) ){
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
//                    System.out.println(token + " ");
                    ps.printf("%s \n", token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
