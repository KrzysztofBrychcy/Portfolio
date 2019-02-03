package com.kodilla.rock_paper_scissors.rules;

import com.kodilla.rock_paper_scissors.players.Comp;
import com.kodilla.rock_paper_scissors.players.Players;

public class Rules {
    public static final String PAPER = "Papier";
    public static final String ROCK = "Kamień";
    public static final String SCISSORS = "Nożyczki";
    private Players winner;
    private Players losser;

    public Rules() {
    }

    public void whoWins(Players player1, Comp computer) {
        if(player1.getShape() == computer.getShape()) {
            System.out.println("Remis");
        } else {
            if(player1.getShape().toString() == PAPER) {
                if(computer.getShape().toString() == ROCK) {
                    winner = player1;
                    losser = computer;
                } else {
                    winner = computer;
                    losser = player1;
                }
            }
            if(player1.getShape().toString() == ROCK) {
                if(computer.getShape().toString() == SCISSORS) {
                    winner = player1;
                    losser = computer;
                } else {
                    winner = computer;
                    losser = player1;
                }
            }
            if (player1.getShape().toString() == SCISSORS) {
                if(computer.getShape().toString() == PAPER) {
                    winner = player1;
                    losser = computer;
                } else {
                    winner = computer;
                    losser = player1;
                }
            }

            screenScore(winner,losser);
        }
    }

    private void screenScore(Players winner, Players looser) {
        winner.win();
        looser.lost();
        System.out.println("Wygrywa --> " + winner.getNick() + " <--");
    }



}
