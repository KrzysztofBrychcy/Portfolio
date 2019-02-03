package com.kodilla.rock_paper_scissors.shapes;

public class Scissors implements Shape {
    private final String name = "Nożyczki";

    public Scissors() {
    }

    @Override
    public String toString() {
        return name;
    }
}
