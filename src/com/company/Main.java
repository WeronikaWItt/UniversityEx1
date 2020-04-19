package com.company;

public class Main {
    public static void main(String[] args) {
        Clothes c = new Clothes("Dress", "Black", 34);

        System.out.println("You have chosen: " +  c.colour  + " " + c.type + " " + c.size);

        ArithmeticProgression nr = new ArithmeticProgression(0, 5);
        System.out.println(nr.getTerm(2) == 10);
    }
}