package com.javacourse.loops;

/**
 * Created by Sahan on 15.04.2020
 * Same as ex5; use two-dim array
 */

public class Exercise6 {

    private static int sum(int[][] numbers){
        int sum=0;
        for (int[] otherNumbers : numbers) {
            for (int number : otherNumbers) {
                sum+=number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] numbers = new int[][] {new int[] {1,2}, new int[] {3,4}, new int[] {5,6}};
        System.out.println(sum(numbers));
    }

}
