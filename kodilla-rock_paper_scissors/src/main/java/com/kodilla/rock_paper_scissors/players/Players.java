package com.kodilla.rock_paper_scissors.players;

import com.kodilla.rock_paper_scissors.shapes.Shape;

public class Players {
    private String nick;
    private int wins;
    private int loses;
    private Shape shape;

    public Players(String nick) {
        this.nick = nick;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getNick() {
        return nick;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }
}
