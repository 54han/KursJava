package com.javacourse.exception;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Nie dzielimy przez 0");
        }

        // Przekazanie obsługi wyjątku z metody divide przez "throws"\

        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Nie dzielimy przez 0");
        }
    }

    private static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
