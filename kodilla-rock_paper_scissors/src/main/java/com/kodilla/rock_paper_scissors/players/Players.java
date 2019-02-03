package com.kodilla.rock_paper_scissors.players;

import com.kodilla.rock_paper_scissors.shapes.Shape;

public class Players {
    private String nick;
    private int wins = 0;
    private int loses = 0;
    private Shape shape;

    public Players() {
    }

    public Players(String nick) {
        this.nick = nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void win() {
        this.wins ++;
    }

    public void lost() {
        this.loses ++;
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

    public void cleanScore() {
        wins = 0;
        loses = 0;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public String getScore() {
        return  "Wygrane: " + getWins() + "-" + getLoses() + " :Przegrane";
    }
}
