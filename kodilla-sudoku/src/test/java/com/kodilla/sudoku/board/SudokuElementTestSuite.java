package com.kodilla.sudoku.board;

import org.junit.Assert;
import org.junit.Test;

public class SudokuElementTestSuite {
    @Test
    public void testSudokuElement() {
        //Give
        SudokuElement P1 = new SudokuElement();
        P1.setValue(2);

        //When

        int value = P1.getValue();

        //Then

        System.out.println(value);
        Assert.assertEquals(2,value);

    }
}
