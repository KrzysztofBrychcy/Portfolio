package com.kodilla.rock_paper_scissors.rules;

import com.kodilla.rock_paper_scissors.players.Players;
import com.kodilla.rock_paper_scissors.shapes.Shape;

public class Rules {
    public static final String PAPER = "PAPER";
    public static final String ROCK = "ROCK";
    public static final String SCISSORS = "SCISSORS";
    private Players winner;
    private Players losser;


    public void whoWins(Players player1, Players computer) {
        switch (player1.getShape().getName()) {
            case PAPER:
            {
                if(computer.getShape().getName() == PAPER) {
                    System.out.println("Remis");
                } else if (computer.getShape().getName() == ROCK) {
                    winner = computer;
                    losser = player1;
                } else if (computer.getShape().getName() == SCISSORS) {
                    winner = player1;
                    losser = computer;
                }
            }
            case ROCK:
            {
                if(computer.getShape().getName() == ROCK) {
                    System.out.println("Remis");
                } else if (computer.getShape().getName() == PAPER) {
                    winner = computer;
                    losser = player1;
                } else if (computer.getShape().getName() == SCISSORS) {
                    winner = player1;
                    losser = computer;
                }
            }
            case SCISSORS:
                if(computer.getShape().getName() == SCISSORS) {
                    System.out.println("Remis");
                } else if (computer.getShape().getName() == ROCK) {
                    winner = computer;
                    losser = player1;
                } else if (computer.getShape().getName() == PAPER) {
                    winner = player1;
                    losser = computer;
                }
        }
    }



}
