package com.javacourse.enums.exercises;

public class Human {
    private String name;
    private int age;
    private EyeColour eyeColour;
    private HairColour hairColour;

    public Human(String name, int age, EyeColour eyeColour, HairColour hairColour) {
        this.name = name;
        this.age = age;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EyeColour getEyeColour() {
        return eyeColour;
    }

    public HairColour getHairColour() {
        return hairColour;
    }

    public static void main(String[] args) {
        Human sahan = new Human("Sahan", 25, EyeColour.BROWN, HairColour.BLACK);

        System.out.println(sahan.getName());
        System.out.println(sahan.getAge());
    }
}
