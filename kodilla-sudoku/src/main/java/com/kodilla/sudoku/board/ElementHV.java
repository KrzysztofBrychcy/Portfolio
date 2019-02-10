package com.kodilla.sudoku.board;

public class ElementHV {
    int h=0,v=0;

    public ElementHV() {
    }

    public ElementHV(int h, int v) {
        this.h = h;
        this.v = v;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
