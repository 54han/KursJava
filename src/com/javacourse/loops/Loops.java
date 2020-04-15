package com.javacourse.loops;

/**
 * Created by Sahan on 15.04.2020
 *
 * Operatory
 * && => AND
 * || => OR
 * Operatory <, ==, > maja wiekszy priorytet niż && i ||
 */

public class Loops {

    private void ifExample(int temp){
        if (temp < 36) {
            System.out.println("Jesteś osłabiony?");
        }
        else if (temp < 37) {
            System.out.println("Wszystko w normie!");
        }
        else if (temp < 38) {
            System.out.println("Jesteś przeziębiony?");
        }
        else {
            System.out.println("Masz co najmniej 38 stopni! Biegiem do lekarza!");
        }
    }

    private void switchExample(int temp) {
        switch (temp) {
            case 35:
                System.out.println("Jesteś osłabiony?");
                break;
            case 36:
                System.out.println("Wszystko w normie!");
                break;
            case 37:
                System.out.println("Jesteś przeziębiony?");
                break;
            case 38:
                System.out.println("Chyba jesteś chory.");
                break;
            default:
                System.out.println("Nie wiem jak się czujesz :(");
                break;
        }
    }

    private void forExample() {
        for (int number = 0; number <= 10; number++) {
            System.out.println(number);
        }
    }

    private void whileExample(int number) {
        while (number <= 20) {
            System.out.println(number);
            number++;
        }

        System.out.println("***");

        while (true) {
            System.out.println(number);
            number++;
            if (number==30) {
                break;
            }
        }

        System.out.println("***");

        while (number < 40) {
            number++;
            if (number % 2 == 0) { // jeżeli reszta z dzielenia przez 2 == 0
                continue;
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        int temp = 36;
        int number = 10;
        Loops loops = new Loops();
        // loops.ifExample();
        // loops.switchExample(temp);
        // loops.forExample();
        loops.whileExample(number);
    }

}
