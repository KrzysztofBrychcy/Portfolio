package com.kodilla.sudoku.board;

import java.util.ArrayList;

public class SudokuElement {
    int value, EMPTY = 0;
    int block, blockOrder = 0;
    public ArrayList<Integer> cloneVarations = new ArrayList<>();

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

    public ArrayList<Integer> getCloneVarations() {
        return cloneVarations;
    }

    public void setCloneVarations(ArrayList<Integer> cloneVarations) {
        this.cloneVarations = cloneVarations;
    }
}
