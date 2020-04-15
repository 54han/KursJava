package com.javacourse.loops;

/**
 * Created by Sahan on 15.04.2020
 * Use for; print odd numbers between -10 and 40
 */

public class Exercise3 {
    public static void main(String[] args) {
        for (int i=-10; i <=40 ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
