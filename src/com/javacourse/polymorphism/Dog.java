package com.javacourse.polymorphism;

public class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bark bark");
    }
}
