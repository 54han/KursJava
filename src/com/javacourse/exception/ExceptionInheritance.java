package com.javacourse.exception;

public class ExceptionInheritance {
    public static void main(String[] args) {
        multipleCatchBlocks();
        multipleExceptionsInOneCatch();
    }

    private static void multipleExceptionsInOneCatch() {
        try {
            someMagicMethod();
        }
        catch (ArithmeticException | IllegalArgumentException exception) {
            // uzywamy | do oddzielenia wyjatkow
        }
    }

    private static void someMagicMethod() {
    }

    private static void multipleCatchBlocks() {
        try {
            throw new IllegalArgumentException();
        }
        catch (ArithmeticException exception) {
            System.out.println("Ten catch nie zostanie wykonany");
        }
        catch (RuntimeException exception) {
            System.out.println("Ten catch zostanie wykonany");
        }
        catch (Exception exception) {
            System.out.println("Ten catch nei zostanie wykonany");
        }
    }
}
