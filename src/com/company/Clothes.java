package com.company;

public class Clothes {
    public String type;
    public String colour;
    public int size;

    static {
        System.out.println("You're in clothes section now");
    }

    Clothes(String type, String colour, int size) {
        this.type = type;
        this.colour = colour;
        this.size = size;
    }
}
