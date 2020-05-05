package com.javacourse.polymorphism;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("Siema");
        Object str2 = new String("Elo");

        System.out.println(str1);
        System.out.println(str2);

        Animal animal = new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();
        Animal fox = new Fox();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
        fox.animalSound();
    }
}
