package com.kodilla.rock_paper_scissors.players;

import com.kodilla.rock_paper_scissors.shapes.Rock;
import com.kodilla.rock_paper_scissors.shapes.Shape;
import org.junit.Assert;
import org.junit.Test;

public class PlayersTestSuite {
    @Test
    public void testNewPlayer() {

        //Give
        Players player1 = new Players("Krysek");
        player1.setShape(new Rock());
        player1.lost();
        player1.win();

        //When
        int playerWins = player1.getWins();
        int playerLoses = player1.getLoses();
        Shape playerShape = player1.getShape();

        //Then
        player1.getScore();
        System.out.println(playerShape);
        Assert.assertEquals(1, playerWins);
        Assert.assertEquals(1, playerLoses);


    }
}
