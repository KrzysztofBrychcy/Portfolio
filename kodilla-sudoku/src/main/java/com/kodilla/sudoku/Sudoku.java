package com.kodilla.sudoku;

public class Sudoku {
    public static void main (String [] args) {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
