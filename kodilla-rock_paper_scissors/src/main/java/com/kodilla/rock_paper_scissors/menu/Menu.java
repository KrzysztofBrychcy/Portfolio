package com.kodilla.rock_paper_scissors.menu;

import com.kodilla.rock_paper_scissors.play.PlayGround;
import com.kodilla.rock_paper_scissors.players.Comp;
import com.kodilla.rock_paper_scissors.players.Players;
import com.kodilla.rock_paper_scissors.rules.Rules;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    private int howManyRounds, acctualRound, stop;
    private String nick;
    private Scanner read = new Scanner(System.in);
    private Scanner readEnd = new Scanner(System.in);
    private boolean end, fin = false;
    private Comp comp = new Comp();
    private Players player1 = new Players();
    private PlayGround playGround = new PlayGround();
    private Random compShape = new Random();
    private Rules rules = new Rules();

    public Menu() {
    }

    public void play() {
        System.out.println("Gra: Papier, Kamień, Nożyce");
        setPlayerName();
        while(!fin) {
            sets();
            game();
            System.out.println("Czy chcesz zakończyć grę? T/N");
            endGame();
            if(fin == true) {
                System.out.println("Czy na pewno? T/N");
                endGame();
            }
        }
        System.out.println("Może zagramy jeszcze kiedyś!");
    }

    public void game() {
        player1.cleanScore();
        comp.cleanScore();
        acctualRound = 0;
        end = false;
        while (!end){
            acctualRound ++;
            System.out.println("\nRunda #" + acctualRound + "\n");

            System.out.println("Wybierz ruch: \n" +
                    "1 -> Kamień\n" +
                    "2 -> Papier\n" +
                    "3 -> Nożyce");
            playGround.chooseShape(player1, playGround.playerChoose(player1));
            System.out.println("Wybrałeś: " + player1.getShape());
            playGround.chooseShape(comp, compShape.nextInt(3)+1);
            System.out.println("Komputer wybrał: " + comp.getShape());
            rules.whoWins(player1,comp);
            System.out.println(player1.getScore());
            if(player1.getWins() >= howManyRounds || comp.getWins() >= howManyRounds) {
                end = true;
                winner();
            }
        }
    }

    public void winner() {
        if(player1.getWins() > comp.getWins()) {
            System.out.println("\nWygrał --->" + player1.getNick());
        }
        else {
            System.out.println("\nWygrał --->" + comp.getNick());
        }
    }

    public void setPlayerName() {
        System.out.println("Podaj swój nick");
        nick = read.nextLine();
        player1.setNick(nick);

    }

    public void sets() {
        System.out.println("Po ilu wygranych rundach jest zwyciętswo?");
        howManyRounds = read.nextInt();

    }

    public void endGame() {
        String endOfGame;
        endOfGame = readEnd.nextLine();
        switch (endOfGame){
            case "T":
                System.out.println("end of game = " + endOfGame + "  " + fin);
                fin = true;
                System.out.println(fin);
                break;
            case "t":
                System.out.println("end of game = " + endOfGame + "  " + fin);
                fin = true;
                System.out.println(fin);
                break;
            default:
                fin = false;
        }
    }
}
