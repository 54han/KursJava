package com.javacourse.arrays;

/**
 * Created by Sahan on 09.04.2020
 */

public class Arrays {
    public static void main(String[] args) {

        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "monday";
        daysOfWeek[1] = "thursday";
        daysOfWeek[2] = "wednesday";
        daysOfWeek[3] = "tuesday";
        daysOfWeek[4] = "friday";
        daysOfWeek[5] = "saturday";
        daysOfWeek[6] = "sunday";

        System.out.println(daysOfWeek[3]);
        System.out.println(daysOfWeek.length); //

        String[] winterMonths = new String[] {"december", "january", "february"};
        System.out.println(winterMonths[2]);

        // Multidimensional Arrays

        int[][] ticTacToeBoard = new int[3][0];
        ticTacToeBoard[0] = new int[3];
        ticTacToeBoard[1] = new int[3];
        ticTacToeBoard[2] = new int[3]; // To samo możemy uzyskać int[][] ticTacToeBoard = new int[3][3]

    }
}
