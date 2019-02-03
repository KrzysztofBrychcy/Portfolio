package com.kodilla.rock_paper_scissors.rules;

import com.kodilla.rock_paper_scissors.players.Comp;
import com.kodilla.rock_paper_scissors.players.Players;
import com.kodilla.rock_paper_scissors.shapes.Paper;
import com.kodilla.rock_paper_scissors.shapes.Rock;
import com.kodilla.rock_paper_scissors.shapes.Scissors;
import com.kodilla.rock_paper_scissors.shapes.Shape;
import org.junit.Test;

public class RulesTestSuite {
    @Test
    public void testWhoWins() {
        //Give
        Rules rules = new Rules();
        Shape paper = new Paper();
        Shape rock = new Rock();
        Shape scisors = new Scissors();
        Players player1 = new Players("Krysek");
        Comp computer = new Comp();
        //When
        System.out.println("\nRunda1");
        player1.setShape(paper);
        computer.setShape(paper);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        System.out.println("\nRunda2");
        player1.setShape(paper);
        computer.setShape(rock);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        System.out.println("\nRunda3");
        player1.setShape(paper);
        computer.setShape(scisors);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        System.out.println("\nRunda4");
        player1.setShape(rock);
        computer.setShape(rock);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        System.out.println("\nRunda5");
        player1.setShape(rock);
        computer.setShape(scisors);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        System.out.println("\nRunda6");
        player1.setShape(rock);
        computer.setShape(paper);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        System.out.println("\nRunda7");
        player1.setShape(scisors);
        computer.setShape(scisors);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        System.out.println("\nRunda8");
        player1.setShape(scisors);
        computer.setShape(paper);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        System.out.println("\nRunda9");
        player1.setShape(scisors);
        computer.setShape(rock);
        System.out.println(player1.getNick() + " -> " + player1.getShape());
        System.out.println(computer.getNick() + " -> " + computer.getShape());
        rules.whoWins(player1,computer);
        System.out.println(player1.getNick() + " -> " + player1.getScore());
        System.out.println(computer.getNick() + " -> " + computer.getScore());

        //Then
    }
}
