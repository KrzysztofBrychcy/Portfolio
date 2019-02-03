package com.kodilla.rock_paper_scissors.shapes;

public class Rock implements Shape {
    private final String name = "Kamień";

    public Rock() {
    }

    @Override
    public String toString() {
        return name;
    }
}
