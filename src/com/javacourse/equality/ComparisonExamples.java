package com.javacourse.equality;

public class ComparisonExamples {
    public static void main(String[] args) {

        /**
         * Używając operatora == do porównywania obiektów uzyskamy błędne rezultaty. Do porównania tego typu powinniśmy używać metody equals.
         */

        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + new String("test").equals(new String("test")));

        String reference1 = new String("something");
        String reference2 = reference1;
        System.out.println("reference1 == reference2: " + (reference1 == reference2));
    }
}
