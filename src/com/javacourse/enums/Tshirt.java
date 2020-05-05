package com.javacourse.enums;

public class Tshirt {
    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt basicS = new Tshirt(TshirtSize.S, "Fruit of the loom");
        System.out.println(basicS.size);
        System.out.println(basicS.manufacturer);

    }
}
