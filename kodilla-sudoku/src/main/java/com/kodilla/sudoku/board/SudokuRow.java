package com.kodilla.sudoku.board;

import java.util.ArrayList;

public class SudokuRow {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 8;
    ArrayList<SudokuElement> row = new ArrayList<>();

    public SudokuRow() {
    }

    public ArrayList<SudokuElement> getRow() {
        return row;
    }

    public int getRowElement(int v) {
        return row.get(v-1).getValue();
    }

    public void setRowElement(int v, int value) {
        this.row.get(v-1).setValue(value);
    }

    @Override
    public String toString() {
        String result = "|";
        for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            result += row.get(i).getValue();
            result += "|";
        }
        return result;
    }
}
