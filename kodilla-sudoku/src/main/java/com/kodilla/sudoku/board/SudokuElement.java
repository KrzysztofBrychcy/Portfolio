package com.kodilla.sudoku.board;

public class SudokuElement {
    int value, EMPTY = 0;
    int block, blockOrder = 0;

    public SudokuElement() {
        this.value = EMPTY;
    }


    public void setValue(int value) {
        if(value < 1 || value > 9) {
            this.value = EMPTY;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public void setBlockOrder(int blockOrder) {
        this.blockOrder = blockOrder;
    }

    public int getBlock() {
        return block;
    }

    public int getBlockOrder() {
        return blockOrder;
    }

}
