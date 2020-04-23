package com.javacourse.cast.exercises;

/**
 * Jak myślisz co otrzymasz przypisując zmienną typu char do zmiennej typu int? Znajdziesz ten numer w tabeli ASCII?
 */

public class Exercise3 {
    public static void main(String[] args) {
        char aAsChar = 'a';
        System.out.println(aAsChar);
        int aAsInt = aAsChar;
        System.out.println(aAsInt);

        int ninetyEightAsInt = 98;
        System.out.println(ninetyEightAsInt);
        char ninetyOneAsChar = (char) ninetyEightAsInt;
        System.out.println(ninetyOneAsChar);
    }
}
