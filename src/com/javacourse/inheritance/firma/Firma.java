package com.javacourse.inheritance.firma;

public class Firma {
    public static void main(String[] args) {
        Pracownik prac1 = new Pracownik("John","Doe",5000);
        System.out.println("Imie: " + prac1.imie);
        System.out.println("Nazwisko: " + prac1.nazwisko);
        System.out.println("Pensja: " + prac1.wyplata);

        Szef szef = new Szef();
        System.out.println("Imię: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wypłata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premiaSzefoska+"\n");

        szef.imie = "Tadeusz";
        szef.nazwisko = "Kowalski";
        szef.wyplata = 10000;
        szef.premiaSzefoska = 2000;
        System.out.println("Imię: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wypłata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premiaSzefoska);
    }
}
