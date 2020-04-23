package com.javacourse.objects;

public class StringExample {
    public static void main(String[] args) {

        // Dwie zmienne, dwie referencje i DWA ROZNE OBIEKTY (z taką samą zawartością)
        String x1 = new String("x");
        String x2 = new String("x");

        // Dwie zmienne, dwie referencje ALE JEDEN OBIEKT (kopia przekazanego literału "x") takie podejście ogranicza ilość zużytego miejsca
        String x3 = "x";
        String x4 = "x";
    }
}
