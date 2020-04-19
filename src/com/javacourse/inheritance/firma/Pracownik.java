package com.javacourse.inheritance.firma;

public class Pracownik {
    String imie;
    String nazwisko;
    double wyplata;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, double wyplata) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }

    String getImie(){ return imie; }
    String getNazwisko(){ return nazwisko; }
    double getWyplata(){ return wyplata; }

}
