package com.javacourse.cast;

public class ArithmeticConversion {
    public static void main(String[] args) {
        short shortValue = 1;
        int intValue = 1;
        long longValue = 2;
        float floatValue = 3.1F;
        double doubleValue = 4.1;

        System.out.println(intValue + doubleValue); // automatyczna konwersja intValue do typu double
        System.out.println(intValue + floatValue); // automatyczna konwersja intValue do typu float
        System.out.println(intValue + longValue); // automatyczna konwersja intValue do typu long
        System.out.println(shortValue + shortValue); // automatyczna konwersja rozszerzająca (wynik typu int)

        System.out.println("Conajmniej jeden z elementow dzielenia musi byc typu zmiennoprzecinkowego aby taki otrzymac:");

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5/2.0);
        System.out.println(6/2);
        System.out.println(6.0/2);

    }
}
