package com.javacourse.objects;

import java.sql.SQLOutput;

public class ChangingFields {
    private int attribute;

    public ChangingFields (int attribute) {
        this.attribute = attribute;
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute (int attribute) {
        this.attribute = attribute;
    }

    public static void main(String[] args) {
        ChangingFields reference1 = new ChangingFields(123); // zmienna wskazuje na OBIEKT (znajdujący się w stercie - heap space
        ChangingFields reference2 = reference1;

        int zmienna; // zmienna lokalna typu prostego jest trzymana na stosie - stack

        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());

        reference1.setAttribute(999); // wystarczy zmienic tylko jedną zmienną

        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());
    }
}
