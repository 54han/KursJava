package com.javacourse.inheritance;

public class Car extends Vehicle {
    public void startEngine() {
        super.startEngine(); // Wywołanie metody z klasy bazowej Vehicle
        System.out.println("Force driver to fasten seat belts.");
    }

}
