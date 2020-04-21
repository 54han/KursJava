package com.javacourse.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {

        File file = new File("test.txt");
        boolean exists = file.exists();

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
