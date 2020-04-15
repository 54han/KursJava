package com.javacourse.loops;

/**
 * Created by Sahan on 15.04.2020
 * Use while; print odd numbers between -10 and 40
 */

public class Exercise4 {
    public static void main(String[] args) {
        int i = -10;
        while (i <= 40) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        i++;
        }
    }
}
