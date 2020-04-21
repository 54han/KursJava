package com.javacourse.exception;

public class Exceptions {

    public static int getNumberOfSeconds(int hour){
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }

    public static void main(String[] args) {
        int hours = -3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = getNumberOfSeconds(hours);
        }
        catch (IllegalArgumentException e) {
            numberOfSeconds = getNumberOfSeconds(hours * -1);
        }
        finally {
            System.out.println("blok finally hehe a ponizej liczba sekund w 3h");
        }
        System.out.println(numberOfSeconds);

    }

}
