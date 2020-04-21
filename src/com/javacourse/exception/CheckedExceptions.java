package com.javacourse.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptions {
    public static void main(String[] args) {
        CheckedExceptions instance = new CheckedExceptions();

        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void run() throws IOException {
        File file = new File("test.txt");

        if (file.exists()) { // Lepiej zapobiegac niz leczyc
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
        } else {
            System.out.println("Taki plik nie istnieje");
        }
    }
}
