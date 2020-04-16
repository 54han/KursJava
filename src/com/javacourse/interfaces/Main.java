package com.javacourse.interfaces;

import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Wpisz M jeżeli chcesz pomnożyć; każdy inny wybór spowoduje dodanie argumentow");
        return scanner.next().equals("M");
    }

    private double getArgument() {
        System.out.println("Podaj argument: ");
        return scanner.nextDouble();
    }

}
