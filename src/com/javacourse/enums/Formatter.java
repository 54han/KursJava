package com.javacourse.enums;

public enum Formatter {
    CALM {
        public String format(String message) {
            return "Here is your message: " + message;
        }
    },
    NERVOUS {
        public String format(String message) {
            return "ARGH! STOP BOTHERING ME WITH YOUR MESSAGE! " + message;
        }
    };

    public abstract String format(String message);

    public static void main(String[] args) {
        System.out.println(Formatter.CALM.format("Jestem spokojny"));
        System.out.println(Formatter.NERVOUS.format("Jestem zdenerwowany"));
    }
}
