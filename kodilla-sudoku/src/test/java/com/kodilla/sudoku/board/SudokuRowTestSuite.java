package com.kodilla.sudoku.board;

import org.junit.Test;

public class SudokuRowTestSuite {

    @Test
    public void testSudokuRow() {
        //Give
        SudokuRow row = new SudokuRow();
        for(int i = 0; i < 9; i++){
            row.getRow().add(new SudokuElement());
        }
        //When
        row.setRowElement(1,3);
        row.setRowElement(9,6);

        int p1 = row.getRowElement(1);

        //Then
        System.out.println(row);
        System.out.println(p1);

    }
}
