package com.javacourse.cast;

public class CastExceptionExample {
    public static void main(String[] args) {
        Object someObject = "string";
        Object anotherObject = new Object(); //null

        String castedString = (String) someObject;
        String classCastException = (String) anotherObject; // nie jest możliwe rzutowanie obiektu typu java.lang.Object do typu String!
    }
}
