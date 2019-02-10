package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.solution.Solution;

public class SudokuGame {

    public boolean resolveSudoku() {
        SudokuBoard board = new SudokuBoard();
        board.prepareSudokuBoard();
        System.out.println(board);
        //dodaj wartosci

        //rozwiaz

        System.out.println(board);

        return true;
    }
}
