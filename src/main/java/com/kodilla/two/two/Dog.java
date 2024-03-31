package com.kodilla.two.two;

public class Dog {

    private final String name;
    private final int age;
    private final String colour;

    public Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }
}
