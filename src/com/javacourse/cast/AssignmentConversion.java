package com.javacourse.cast;

public class AssignmentConversion {
    public static void main(String[] args) {
        long longValue = 123; // niejawna konwersja z int na long
        int intValue = (short) 123; // jawna konwersja na typ short a następnie niejawna z powrtoem na typ int
        float floatValue = 12.12F;
        double doubleValue = floatValue; // niejawna konwersja z typu float do double

        System.out.println(longValue);
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
    }
}
