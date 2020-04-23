package com.javacourse.objects;

public class ObjectVersusReference {
    public static void main(String[] args) {
        Object referenceToObjectX = new Object();
        Object anotherReferenceToObjectX = referenceToObjectX;
        Object referenceToObjectY = new Object();

        System.out.println(referenceToObjectX.toString());
        System.out.println(anotherReferenceToObjectX.toString());
        System.out.println(referenceToObjectY.toString());
    }
}
