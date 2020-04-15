package com.javacourse.primitivetypes;

/**
 * Created by Sahan on 15.04.2020
 * Usage of java.util.Scanner
 */

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        double[] temp = new double[7];
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Wprowadź temperaturę z kolejnych dni: ");

        for (int i = 0; i < temp.length ; i++) {
            System.out.println("Dzien " + (i+1) + ": ");
            temp[i] = inputScanner.nextDouble();
        }

        double sumTemp = 0;
        for (double eachTemp : temp) {
            sumTemp += eachTemp;
        }

        System.out.println("Srednia temperatura wynosi: " + sumTemp / temp.length);
    }
}
