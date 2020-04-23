package com.javacourse.cast;

public class NarrowingConversion {
    public static void main(String[] args) {
        NarrowingConversion conversion = new NarrowingConversion();
        int intVariable = Integer.MAX_VALUE;
        long longVariable = Long.MAX_VALUE;
        long longVariableWithoutLoosingInfo = Integer.MAX_VALUE;

        conversion.methodIntArgument(intVariable);
        conversion.methodIntArgument((int) longVariable); // tutaj nastapi utrata informacji poniewaz MAX_VALUE long >>>> int
        conversion.methodIntArgument((int) longVariableWithoutLoosingInfo);
    }

    private void methodIntArgument(int argument) {
        System.out.println(argument);
    }
}
