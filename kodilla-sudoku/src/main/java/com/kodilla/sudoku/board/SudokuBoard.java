package com.kodilla.sudoku.board;

import com.kodilla.sudoku.prototype.Prototype;
import java.util.ArrayList;

public class SudokuBoard extends Prototype {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 8;
    SudokuElementDto sudokuElementDto = new SudokuElementDto();
    ArrayList<SudokuRow> board = new ArrayList<>();

    public SudokuBoard() {
    }

    public void prepareSudokuBoard() {
        setBoard();
        setBlocks();
        setBlocksOrder();
    }

    public ArrayList<SudokuRow> getBoard() {
        return board;
    }

    public int getElement(int v, int h) {
        return board.get(h-1).getRow().get(v-1).getValue();
    }

    public void setElement(int v, int h, int value) {
        this.board.get(h-1).setRowElement(v, value);
    }

    public int getElementByBlock(int block, int blockOrder) {
        sudokuElementDto.fromBlocksToHV(block,blockOrder);
        return board.get(sudokuElementDto.getElementHV().getH()-1).getRow().get(sudokuElementDto.getElementHV().getV()-1).getValue();
    }

    public void setBoard(){
        SudokuRow row1 = new SudokuRow();
        SudokuRow row2 = new SudokuRow();
        SudokuRow row3 = new SudokuRow();
        SudokuRow row4 = new SudokuRow();
        SudokuRow row5 = new SudokuRow();
        SudokuRow row6 = new SudokuRow();
        SudokuRow row7 = new SudokuRow();
        SudokuRow row8 = new SudokuRow();
        SudokuRow row9 = new SudokuRow();
        for(int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            row1.getRow().add(new SudokuElement());
            row2.getRow().add(new SudokuElement());
            row3.getRow().add(new SudokuElement());
            row4.getRow().add(new SudokuElement());
            row5.getRow().add(new SudokuElement());
            row6.getRow().add(new SudokuElement());
            row7.getRow().add(new SudokuElement());
            row8.getRow().add(new SudokuElement());
            row9.getRow().add(new SudokuElement());
        }
        board.add(row1);
        board.add(row2);
        board.add(row3);
        board.add(row4);
        board.add(row5);
        board.add(row6);
        board.add(row7);
        board.add(row8);
        board.add(row9);
    }

    public void setBlocks() {
        for(int i = 1; i < 10; i++){
            for(int k = 1; k < 10 ; k++) {
                if (((i == 1) || (i == 2) || (i == 3)) && ((k == 1) || (k == 2) || (k == 3))) {
                    board.get(i-1).getRow().get(k-1).setBlock(1);
                }
                if(((i == 1) || (i == 2) || (i == 3)) && ((k == 4) || (k == 5) || (k == 6))) {
                    board.get(i-1).getRow().get(k-1).setBlock(2);
                }
                if(((i == 1) || (i == 2) || (i == 3)) && ((k == 7) || (k == 8) || (k == 9))) {
                    board.get(i-1).getRow().get(k-1).setBlock(3);
                }
                if(((i == 4) || (i == 5) || (i == 6)) && ((k == 1) || (k == 2) || (k == 3))) {
                    board.get(i-1).getRow().get(k-1).setBlock(4);
                }
                if(((i == 4) || (i == 5) || (i == 6)) && ((k == 4) || (k == 5) || (k == 6))) {
                    board.get(i-1).getRow().get(k-1).setBlock(5);
                }
                if(((i == 4) || (i == 5) || (i == 6)) && ((k == 7) || (k == 8) || (k == 9))) {
                    board.get(i-1).getRow().get(k-1).setBlock(6);
                }
                if(((i == 7) || (i == 8) || (i == 9)) && ((k == 1) || (k == 2) || (k == 3))) {
                    board.get(i-1).getRow().get(k-1).setBlock(7);
                }
                if(((i == 7) || (i == 8) || (i == 9)) && ((k == 4) || (k == 5) || (k == 6))) {
                    board.get(i-1).getRow().get(k-1).setBlock(8);
                }
                if(((i == 7) || (i == 8) || (i == 9)) && ((k == 7) || (k == 8) || (k == 9))) {
                    board.get(i-1).getRow().get(k-1).setBlock(9);
                }
            }
        }
    }

    public int getBlocks(int v, int h) {
        return board.get(h-1).getRow().get(v-1).getBlock();
    }

    public void setBlocksOrder() {
       for(int b = 1; b < 10; b++){

        int blockOrder = 1;
            for (int i = 1; i < 10; i++) {
                for (int k = 1; k < 10; k++) {
                    if (board.get(i - 1).getRow().get(k - 1).getBlock() == b) {
                        board.get(i - 1).getRow().get(k - 1).setBlockOrder(blockOrder);
                        blockOrder++;
                        if (blockOrder > 9) {
                            blockOrder = 1;
                        }
                    }
                }

            }
        }
    }

    public int getBlockOrder(int v, int h) {
        return board.get(h-1).getRow().get(v-1).getBlockOrder();
    }

    public SudokuBoard shallowCopy() throws CloneNotSupportedException {
        return (SudokuBoard)super.clone();
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard)super.clone();
        clonedBoard.board = new ArrayList<>();
        clonedBoard.prepareSudokuBoard();
        for(int y = 1; y <= 9; y ++){
            for(int x = 1; x <= 9; x ++) {
                clonedBoard.setElement(x,y,board.get(y-1).getRow().get(x-1).getValue());
            }
        }
        return clonedBoard;
    }

    @Override
    public String toString() {
        String result = "|---|---|---|---|---|---|---|---|---|\n";
        for(int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            result += "| ";
            for(int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if(board.get(i).getRow().get(k).getValue() == 0) {
                    result += " ";
                } else {
                    result += board.get(i).getRow().get(k).getValue();
                }
                result += " | ";
            }
            result += "\n|---|---|---|---|---|---|---|---|---|\n";
        }
        return result;
    }
}
