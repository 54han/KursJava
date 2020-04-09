package com.javacourse.arrays;

/**
 * Created by Sahan on 09.04.2020
 * 3-elements array + max number
 */

public class Exercise2 {
    public int max(int[] numbers) {
        int maxnumb = numbers[0];
        if (numbers[1] > maxnumb) {
            maxnumb = numbers[1];
        }
        if (numbers[2] > maxnumb){
            maxnumb = numbers[2];
        }
        return maxnumb;
    }
    public int maxWithoutIf(int[] numbers){
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }

    public int min(int[] numbers) {
        int minnumb = numbers[0];
        if (numbers[1] < minnumb) {
            minnumb = numbers[1];
        }
        if (numbers[2] < minnumb){
            minnumb = numbers[2];
        }
        return minnumb;
    }
    public int minWithoutIf(int[] numbers){
        return Math.min(numbers[0], Math.min(numbers[1], numbers[2]));
    }

    public static void main(String[] args) {
        Exercise2 exercise = new Exercise2();
        int[] numbers = new int[]{24, 0, -3};
        System.out.println("Największa liczba to: " + exercise.max(numbers));
        System.out.println("Największa liczba to: " + exercise.maxWithoutIf(numbers));
        System.out.println("Najmniejsza liczba to: " + exercise.min(numbers));
        System.out.println("Najmniejsza liczba to: " + exercise.minWithoutIf(numbers));
    }
}
