package com.javacourse.primitivetypes;

/**
 * Created by Sahan on 15.04.2020
 * Napisz program, który policzy średnią z kilku przedmiotów. Możemy założyć, że uczeń w szkole ma 3 przedmioty i z każdego z nich dostał po 4 oceny.
 */

import java.util.Scanner;

public class Exercise1 {

    public static void getNotesFromUser(int numberOfClasses, int numberOfNotes) {
        Scanner scanner = new Scanner(System.in);
        int[][] notes = new int[numberOfClasses][numberOfNotes];
        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++){
            for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
                System.out.println("Podaj ocenę numer: " + (noteIndex+1) + " dla przedmiotu numer: " + (classIndex+1) + ": ");
                notes[classIndex][noteIndex] = scanner.nextInt();
            }
        }
    }

    public static void printAverage(int numberOfClasses, int numberOfNotes) {

    }

    public static void main(String[] args) {
        int numberOfClasses = 3;
        int numberOfNotes = 4;
        getNotesFromUser(numberOfClasses, numberOfNotes);
    }

}
