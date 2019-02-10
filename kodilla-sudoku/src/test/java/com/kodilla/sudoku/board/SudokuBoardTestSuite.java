package com.kodilla.sudoku.board;

import com.kodilla.sudoku.Sudoku;
import org.junit.Assert;
import org.junit.Test;

public class SudokuBoardTestSuite {

    @Test
    public void testSudokuBoard() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.setBoard();

        //When
        board.setElement(2,1,1);
        board.setElement(2,2,8);
        board.setElement(5,1,9);
        board.setElement(9,1,5);
        board.setElement(1,2,6);
        board.setElement(7,2,9);
        board.setElement(8,2,1);
        board.setElement(1,3,3);
        board.setElement(6,3,6);

        //Then
        System.out.println(board);
    }

    @Test
    public void testGetElement() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.setBoard();
        int v,h;
        //When
        board.setElement(2,3,7);
        System.out.println(board);
        v = 2;
        h = 3;
        int p1 = board.getElement(v,h);
        System.out.println("Test: getElement" + v + ":" + h + " -> " + p1);
        //Then
        Assert.assertEquals(7,p1);
    }

    @Test
    public void testSetBlocksAndGetBlocks() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.setBoard();
        board.setBlocks();
        //When
        for(int h = 1; h < 10; h++) {
            for(int v = 1; v < 10; v ++) {
                board.setElement(v,h,board.getBlocks(v,h));
            }
        }

        System.out.println(board);
        int block1 = board.getBlocks(2,2);
        int block2 = board.getBlocks(4,2);
        int block3 = board.getBlocks(8,2);
        int block4 = board.getBlocks(2,5);
        int block5 = board.getBlocks(5,5);
        int block6 = board.getBlocks(8,5);
        int block7 = board.getBlocks(2,8);
        int block8 = board.getBlocks(5,8);
        int block9 = board.getBlocks(8,8);
        System.out.println("Test: Block 2:2 -> " + block1);
        System.out.println("Test: Block 4:2 -> " + block2);
        System.out.println("Test: Block 8:2 -> " + block3);
        System.out.println("Test: Block 2:5 -> " + block4);
        System.out.println("Test: Block 5:5 -> " + block5);
        System.out.println("Test: Block 8:5 -> " + block6);
        System.out.println("Test: Block 2:8 -> " + block7);
        System.out.println("Test: Block 5:8 -> " + block8);
        System.out.println("Test: Block 8:8 -> " + block9);
        //Then
        Assert.assertEquals(1,block1);
        Assert.assertEquals(2,block2);
        Assert.assertEquals(3,block3);
        Assert.assertEquals(4,block4);
        Assert.assertEquals(5,block5);
        Assert.assertEquals(6,block6);
        Assert.assertEquals(7,block7);
        Assert.assertEquals(8,block8);
        Assert.assertEquals(9,block9);
    }

    @Test
    public void testGetSetBlocksOrder() {
        //Give
        SudokuBoard board = new SudokuBoard();
        SudokuBoard board1 = new SudokuBoard();
        board.setBoard();
        board1.setBoard();
        board.setBlocks();
        board1.setBlocks();
        board.setBlocksOrder();
        //When
        for(int h = 1; h < 10; h++) {
            for(int v = 1; v < 10; v ++) {
                board1.setElement(v,h,board1.getBlocks(v,h));
            }
        }

        int block1 = board.getBlocks(5,5);
        int block1Order = board.getBlockOrder(5,5);

        for(int h = 1; h < 10; h++) {
            for(int v = 1; v < 10; v ++) {
                board.setElement(v,h,board.getBlockOrder(v,h));
            }
        }
        //Then
        Assert.assertEquals(5,block1);
        Assert.assertEquals(5,block1Order);
        System.out.println(board);
        System.out.println(board1);
    }

    @Test
    public void testGetValueByBlocks() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.setBoard();
        board.setBlocks();
        board.setBlocksOrder();
        SudokuElementDto sudokuElementDto = new SudokuElementDto();

        //When

        sudokuElementDto.fromBlocksToHV(1,8);
        int h1 = sudokuElementDto.getElementHV().getH();
        int v1 = sudokuElementDto.getElementHV().getV();


        board.setElement(2,1,1);
        board.setElement(2,2,8);
        board.setElement(5,1,9);
        board.setElement(9,1,5);
        board.setElement(1,2,6);
        board.setElement(7,2,9);
        board.setElement(8,2,1);
        board.setElement(1,3,3);
        board.setElement(6,3,6);

        System.out.println(board);

        int p1 = board.getElementByBlock(1,7);

        int h = board.sudokuElementDto.getElementHV().getH();
        int v = board.sudokuElementDto.getElementHV().getV();
        //Then
        System.out.println(p1);
        System.out.println(h + " - " + v);
        System.out.println(h1 + " - " + v1);
    }
}
