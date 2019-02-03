package com.kodilla.rock_paper_scissors.play;

import com.kodilla.rock_paper_scissors.players.Players;
import com.kodilla.rock_paper_scissors.shapes.Paper;
import com.kodilla.rock_paper_scissors.shapes.Rock;
import com.kodilla.rock_paper_scissors.shapes.Scissors;
import com.kodilla.rock_paper_scissors.shapes.Shape;

import java.util.Scanner;


public class PlayGround {
    private Shape rock = new Rock();
    private Shape paper = new Paper();
    private Shape scissors = new Scissors();


    public PlayGround() {
    }

    public int playerChoose(Players player) {
        int shape;
        Scanner read = new Scanner(System.in);
        shape = read.nextInt();
//        System.out.println(player.getShape());
        return shape;
    }

    public void chooseShape(Players player, int shape) {
        switch(shape) {
            case 1:
                player.setShape(rock);
            break;

            case 2:
                player.setShape(paper);
            break;

            case 3:
                player.setShape(scissors);
            break;

            default:
                System.out.println("Wpisz poprawnie");
        }
    }


}
