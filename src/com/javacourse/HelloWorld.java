package com.javacourse;

/**
 * Created by Sahan on 09.04.2020
 */

public class HelloWorld {
    public static void main(String[] args) {
        String message = "To jest mój pierwszy łańcuch znaków.\nAby w wypisywanym tekscie umieścić cudzysłów \" należy poprzedzić go znakiem \\ ";
        System.out.println(message);

        String plusSign = "\u002B"; //unicode

        String message2 = "Łańcuchy znaków możemy ze sobą łączyć przy pomocy symbolu " + plusSign;
        System.out.println(message2);

        int lenght = message2.length(); // długość łańcucha message2
        System.out.println("Ilość znaków powyższej wiadomości wynosi: " + lenght);
    }
}
