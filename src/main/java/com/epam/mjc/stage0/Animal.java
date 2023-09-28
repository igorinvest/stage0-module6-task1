package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        // it is a constructor, which is a special method
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String mostly = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + (numberOfPaws > 1 ? "paws" : "paw") + " and " + ((hasFur) ? "a" : "no") + " fur.";
        return mostly;
    }

}
