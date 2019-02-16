package com.kodilla.rock_paper_scissors.play;

import com.kodilla.rock_paper_scissors.players.Comp;
import com.kodilla.rock_paper_scissors.players.Players;
import org.junit.Test;

import java.util.Random;

public class PlayGroundTestSuite {
    @Test
    public void testCompRandom() {
        //Give
        PlayGround playGround = new PlayGround();
        Players player = new Players("Krysek");
        Comp comp = new Comp();
        Random random = new Random();
        //When

        for(int i = 0; i < 20; i++) {
//        System.out.println(random.nextInt(4)+1);
            playGround.chooseShape(comp, random.nextInt(4)+1);
//            playGround.chooseShape(comp, 4);
            System.out.println(comp.getNick() + " -> " + comp.getShape());
        }
//        playGround.chooseShape(player,0);
//        System.out.println(player.getNick() + " - > " + player.getShape());
        //Then

    }
}
