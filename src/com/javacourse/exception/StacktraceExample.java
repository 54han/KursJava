package com.javacourse.exception;

/**
 * Stacktrace mozna rozumiec jak odwrocony stos wywolan metod od rozpoczecia programu do miejsca w ktorym zostal rzucony wyjatek
 */

public class StacktraceExample {
    public static void main(String[] args) {
        StacktraceExample example = new StacktraceExample();
        example.method1();
    }

    public void method1() {
        method2();
    }

    private void method2() {
        method3();
    }

    private void method3() {
        throw new RuntimeException("BUM! EXCEPTION! ");
    }
}
