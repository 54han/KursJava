package com.javacourse.primitivetypes;

/**
 * Created by Sahan on 15.04.2020
 * byte - lb calkowite od -128 do 127
 * short - lb calkowite od -32’768 do 32’767
 * int - lb calkowite od -2’147’483’648 do 2’147’483’647
 * long - lb calkowite od -9’223’372’036’854’775’808 do 9’223’372’036’854’775’807 (na koncu dodajemy L)
 * char - znak
 * string - łańcuch znaków
 * float - lb zmiennoprzecinkowe (na koncu dodajemy F)
 * double - lb zmiennoprzecinkowe dużo większe niż float
 * w poważniejszych obliczeniach używamy innych typów takich jak java.math.BigDecimal
 */

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte daysInMonth = 31;
        short daysInYear = 365;
        long veryLargeNumber = 7232145523L; // musimy dodac samemu informacje ze zmienna jest literalem "L"

        float pi = 3.14F;
        double g = 9.80665;

        byte b1 = 10;
        Byte b2 = Byte.valueOf((byte) 10); // każdy z typów prostych ma odpowiadający mu obiekt
        Byte b3 = 10; // boxing

        short s1 = 10;
        Short s2 = Short.valueOf((short) 10);

        int i1 = 10;
        Integer i2 = Integer.valueOf(10);

        long l1 = 10L;
        Long l2 = Long.valueOf(10L);

        boolean bo1 = true;
        Boolean bo2 = Boolean.valueOf(true);

        char c1 = 'c';
        Character c2 = Character.valueOf('c');

        float f1 = 1.2F;
        Float f2 = Float.valueOf(1.2F);

        double d1 = 1.2;
        Double d2 = Double.valueOf(1.2);
    }
}
