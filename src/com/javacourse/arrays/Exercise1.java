package com.javacourse.arrays;

/**
 * Created by Sahan on 09.04.2020
 * 2 elements array + sum
 */

public class Exercise1 {
    public int sum(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        Exercise1 exercise = new Exercise1();
        int[] numbers = {1, 2};
        System.out.println(exercise.sum(numbers));
    }
}
