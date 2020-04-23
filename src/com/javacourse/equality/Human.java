package com.javacourse.equality;

import java.util.Objects;

public class Human {
    private final String name;
    private final String surname;
    private final String pesel;

    public Human(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return pesel.equals(human.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

    public static void main(String[] args) {
        Human human1 = new Human("John", "Doe", "123456789");
        Human human2 = new Human("John", "Doe", "987654321");
        Human human3 = new Human("John", "Doe", "123456789");

        System.out.println(human1 + " == " + human2 + " " + human1.equals(human2));
        System.out.println(human2 + " == " + human3 + " " + human2.equals(human3));
        System.out.println(human1 + " == " + human3 + " " + human1.equals(human3));
    }
}
