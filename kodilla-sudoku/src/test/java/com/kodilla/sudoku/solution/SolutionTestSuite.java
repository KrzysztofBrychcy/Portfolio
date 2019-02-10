package com.kodilla.sudoku.solution;

import com.kodilla.sudoku.board.SudokuBoard;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTestSuite {

    @Test
    public void testSolution() {
        //Give
        //When
        //Then
    }

    @Test
    public void testSetAllNumbers() {
        //Give
        Solution solution = new Solution(new SudokuBoard());
        //When
        int sizeBefore = solution.getAllNumbers().size();
        solution.setAllNumbers();
        int sizeAfter = solution.getAllNumbers().size();
        //Then
        System.out.println("Size before -> " + sizeBefore);
        System.out.println("Size after -> " + sizeAfter);
        System.out.println(solution.getAllNumbers());
        Assert.assertEquals(sizeBefore,sizeAfter);
        Assert.assertEquals(9,sizeBefore);
        Assert.assertEquals(9,sizeAfter);
    }

    @Test
    public void testSum() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.setBoard();
        board.setElement(1,1,2);
        Solution solution = new Solution(board);
        //When
        solution.setSum();
        int sumTest1 = solution.getSum();
        boolean isZeroTest1 = solution.isZero(2,2);
        boolean isZeroTest2 = solution.isZero(1,1);
        int sumTest2 = solution.getSum();


        //Then
        Assert.assertEquals(0,sumTest1);
        Assert.assertTrue(isZeroTest1);
        Assert.assertFalse(isZeroTest2);
        Assert.assertEquals(2,sumTest2);
    }

    @Test
    public void testNumberToElement() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.setBoard();
        board.setElement(1,2,1);
        board.setElement(1,3,3);
        System.out.println(board);
        Solution solution = new Solution(board);
        //When
        System.out.println(solution.getAllNumbers());
        boolean testElement3 = solution.numberToElement(1,2);
        boolean testElement4 = solution.numberToElement(1,3);
        boolean testElementZero = solution.numberToElement(1,1);
        solution.addElementToBoard(1,1);
        System.out.println(solution.getAllNumbers());
        System.out.println(board);
        //Then
        Assert.assertFalse(testElementZero);
        Assert.assertFalse(testElement3);
    }

    @Test
    public void testIsZero() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.prepareSudokuBoard();
        board.setElement(1,1,3);
        board.setElement(2,1,2);
        board.setElement(3,1,1);
        board.setElement(5,1,9);
        board.setElement(6,1,8);
        board.setElement(7,1,7);
        board.setElement(8,1,6);
        board.setElement(9,1,5);

        board.setElement(4,2,1);
        board.setElement(4,3,2);
        board.setElement(4,4,3);
        board.setElement(4,5,9);
        board.setElement(4,6,8);
        board.setElement(4,7,7);
        board.setElement(4,8,6);
        board.setElement(4,9,5);

        board.setElement(1,3,9);
        board.setElement(2,3,5);
        board.setElement(3,3,6);

        board.setElement(5,3,7);
        board.setElement(6,3,3);
        board.setElement(7,3,4);
        board.setElement(8,3,8);
        board.setElement(9,3,1);

        board.setElement(1,2,4);
        board.setElement(2,2,7);
        board.setElement(6,2,6);

        System.out.println(board);
        Solution solution = new Solution(board);
        //When
        int sumB = solution.getSum();
//        System.out.println("Move to -> 2:1");
//        solution.isZero(2,1);
//        System.out.println("Move to -> 3:2");
//        solution.isZero(3,2);

//        for(int y = 1; y <= 9; y ++){
//            for(int x = 1; x <= 9; x ++){
//                System.out.println("Move to -> " + x + ":" + y);
//                solution.isZero(x,y);
//            }
//        }

        solution.resolve();

        int sumE = solution.getSum();
        //Then

        System.out.println("Suma na pocz -> " + sumB);
        System.out.println("Suma na konc -> " + sumE);

        System.out.println(board);
    }

    @Test
    public void testResolve() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.prepareSudokuBoard();
        board.setElement(2,1,1);
        board.setElement(4,1,8);
        board.setElement(5,1,9);
        board.setElement(9,1,5);

        board.setElement(1,2,6);
        board.setElement(7,2,9);
        board.setElement(8,2,1);

        board.setElement(1,3,3);
        board.setElement(6,3,6);

        board.setElement(2,4,4);
        board.setElement(4,4,5);
        board.setElement(7,4,1);
        board.setElement(8,4,2);

        board.setElement(1,5,9);
        board.setElement(2,5,3);
        board.setElement(3,5,1);
        board.setElement(5,5,7);
        board.setElement(7,5,5);
        board.setElement(8,5,4);
        board.setElement(9,5,8);

        board.setElement(2,6,2);
        board.setElement(3,6,8);
        board.setElement(6,6,1);
        board.setElement(8,6,3);

        board.setElement(4,7,4);
        board.setElement(9,7,6);

        board.setElement(2,8,9);
        board.setElement(3,8,4);
        board.setElement(9,8,3);

        board.setElement(1,9,8);
        board.setElement(5,9,3);
        board.setElement(6,9,9);
        board.setElement(8,9,7);

 /*       SudokuBoard clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }*/

//        board.setElement(1,1,4);
//        board.setElement(9,9,1);
//        board.setElement(7,8,2);

        System.out.println(board);
        Solution solution = new Solution(board);
        //When
        solution.resolve();

        //Then
//        System.out.println(deepCloneBoard);
    }

    @Test
    public void testSudokuElementClone() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.prepareSudokuBoard();
        board.setElement(1,1,0);
        board.setElement(2,1,2);
        board.setElement(3,1,1);
        board.setElement(5,1,9);
        board.setElement(6,1,8);
        board.setElement(7,1,7);
        board.setElement(8,1,6);
        board.setElement(9,1,5);
        System.out.println(board);
        Solution solution = new Solution(board);

        //When
        System.out.println("Move to -> 4:1");
        solution.isZero(4,1);
        System.out.println("Move to -> 3:1");
        solution.isZero(3,1);

        //Then

    }


    @Test
    public void testCloning() {
        //Give
        SudokuBoard board = new SudokuBoard();
        board.prepareSudokuBoard();
        board.setElement(2,1,1);
        board.setElement(4,1,8);
        board.setElement(5,1,9);
        board.setElement(9,1,5);

        board.setElement(1,2,6);
        board.setElement(7,2,9);
        board.setElement(8,2,1);

        board.setElement(1,3,3);
        board.setElement(6,3,6);

        board.setElement(2,4,4);
        board.setElement(4,4,5);
        board.setElement(7,4,1);
        board.setElement(8,4,2);

        board.setElement(1,5,9);
        board.setElement(2,5,3);
        board.setElement(3,5,1);
        board.setElement(5,5,7);
        board.setElement(7,5,5);
        board.setElement(8,5,4);
        board.setElement(9,5,8);

        board.setElement(2,6,2);
        board.setElement(3,6,8);
        board.setElement(6,6,1);
        board.setElement(8,6,3);

        board.setElement(4,7,4);
        board.setElement(9,7,6);

        board.setElement(2,8,9);
        board.setElement(3,8,4);
        board.setElement(9,8,3);

        board.setElement(1,9,8);
        board.setElement(5,9,3);
        board.setElement(6,9,9);
        board.setElement(8,9,7);

 /*       SudokuBoard clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }*/

//        board.setElement(1,1,4);
//        board.setElement(9,9,1);
//        board.setElement(7,8,2);

        System.out.println(board);
        Solution solution = new Solution(board);
        //When
        solution.resolve();
        Solution solution1 = new Solution(solution.resolveClone());
        solution1.resolve();
        Solution solution2 = new Solution(solution1.resolveClone());
        solution2.resolve();

        //Then
//        System.out.println(deepCloneBoard);
    }
}
