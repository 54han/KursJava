package com.javacourse.varargs;

public class Main {

    public static int suma(int arg0, int...args) {
        int wynik = arg0;

        for (int i = 0; i < args.length; i++) {
            wynik += args[i];
        }
        return wynik;
    }

    public static void wypisz(int arg0, int...args) {
        System.out.println("1 argument stały: " + arg0);
        for (int i = 0; i < args.length ; i++) {
            System.out.println((i+1) + " argument zmienny: " + args[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(suma(3));
        System.out.println(suma(3,3));
        System.out.println(suma(3,3,3));
        System.out.println();
        wypisz(3,4,5,6,7);

    }
}
