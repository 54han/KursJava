package com.javacourse.cast.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Napisz program przyjmujący od użytkownika liczbę całkowitą i wyświetl wynik mnożenia tej liczby oraz stałej pi (Math.PI).
 * Wyświetl wynik w postaci liczby całkowitej i liczby zmiennoprzecinkowej.
 */

public class Exercise1 {

    public static void main(String[] args) {
        int intResult;
        double doubleResult;

        int userInput = getNumber();
        System.out.println(intResult = userInput * (int) Math.PI);
        System.out.println(doubleResult = userInput * Math.PI);

    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Podaj liczbe calkowita: ");
        while(true) {
            try {
                userInput = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Bledna wartosc! Podaj liczbe calkowita: ");
                scanner.next();
            }
        }
        return userInput;
    }
}
