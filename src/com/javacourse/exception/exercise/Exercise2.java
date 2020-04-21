package com.javacourse.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        try {
            System.out.println(calcSqrt(getNumber()));
        } catch (IllegalArgumentException e) {
            System.out.println("Podales argument ujemny. Wyliczenie pierwiastka nie jest mozliwe.");
        }
    }

    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        double userInput = 0;
        System.out.println("Podaj liczbe ktora chcesz spierwiastkowac: ");

        while (true) {
            try {
                userInput = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawna liczbe");
                scanner.next();
            }
        }

        if (userInput<0) { throw new IllegalArgumentException(); }
        return userInput;
    }

    private static double calcSqrt(double numb) throws IllegalArgumentException {
        return Math.sqrt(numb);
    }
}

