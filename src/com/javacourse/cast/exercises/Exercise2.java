package com.javacourse.cast.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Napisz program pobierający od użytkownika dwie liczby całkowite. Wyświetl wynik ich dzielenia wraz z częścią ułamkową.
 */

public class Exercise2 {

    public static void main(String[] args) {
        System.out.println("Podaj 2 liczby calkowite ktore chcesz podzielic: ");
        int n1 = getNumber(1);
        int n2 = getNumber(2);

        System.out.println((double) n1/n2);
    }

    private static int getNumber(int index) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Podaj " + index + " liczbe: ");
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
