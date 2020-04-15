package com.javacourse.loops;

/**
 * Created by Sahan on 15.04.2020
 * Use method, array and sum all array's elements
 */

public class Exercise5 {
    private static int sum(int[] numbers) {
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4,5,6,7};
        System.out.println(sum(numbers));
    }
}
