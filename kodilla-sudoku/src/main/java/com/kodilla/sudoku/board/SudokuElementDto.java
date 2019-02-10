package com.kodilla.sudoku.board;

public class SudokuElementDto {
    ElementHV elementHV = new ElementHV();

    public ElementHV fromBlocksToHV(int block, int blockOrder) {
        if(block == 1) {
            if (blockOrder == 1) {
                elementHV.setV(1);
                elementHV.setH(1);
            }
            if (blockOrder == 2) {
                elementHV.setV(2);
                elementHV.setH(1);
            }
            if (blockOrder == 3) {
                elementHV.setV(3);
                elementHV.setH(1);
            }
            if (blockOrder == 4) {
                elementHV.setV(1);
                elementHV.setH(2);
            }
            if (blockOrder == 5) {
                elementHV.setV(2);
                elementHV.setH(2);
            }
            if (blockOrder == 6) {
                elementHV.setV(3);
                elementHV.setH(2);
            }
            if (blockOrder == 7) {
                elementHV.setV(1);
                elementHV.setH(3);
            }
            if (blockOrder == 8) {
                elementHV.setV(2);
                elementHV.setH(3);
            }
            if (blockOrder == 9) {
                elementHV.setV(3);
                elementHV.setH(3);
            }
        }
        if(block == 2) {
            if (blockOrder == 1) {
                elementHV.setV(4);
                elementHV.setH(1);
            }
            if (blockOrder == 2) {
                elementHV.setV(5);
                elementHV.setH(1);
            }
            if (blockOrder == 3) {
                elementHV.setV(6);
                elementHV.setH(1);
            }
            if (blockOrder == 4) {
                elementHV.setV(4);
                elementHV.setH(2);
            }
            if (blockOrder == 5) {
                elementHV.setV(5);
                elementHV.setH(2);
            }
            if (blockOrder == 6) {
                elementHV.setV(6);
                elementHV.setH(2);
            }
            if (blockOrder == 7) {
                elementHV.setV(4);
                elementHV.setH(3);
            }
            if (blockOrder == 8) {
                elementHV.setV(5);
                elementHV.setH(3);
            }
            if (blockOrder == 9) {
                elementHV.setV(6);
                elementHV.setH(3);
            }
        }
        if(block == 3) {
            if (blockOrder == 1) {
                elementHV.setV(7);
                elementHV.setH(1);
            }
            if (blockOrder == 2) {
                elementHV.setV(8);
                elementHV.setH(1);
            }
            if (blockOrder == 3) {
                elementHV.setV(9);
                elementHV.setH(1);
            }
            if (blockOrder == 4) {
                elementHV.setV(7);
                elementHV.setH(2);
            }
            if (blockOrder == 5) {
                elementHV.setV(8);
                elementHV.setH(2);
            }
            if (blockOrder == 6) {
                elementHV.setV(9);
                elementHV.setH(2);
            }
            if (blockOrder == 7) {
                elementHV.setV(7);
                elementHV.setH(3);
            }
            if (blockOrder == 8) {
                elementHV.setV(8);
                elementHV.setH(3);
            }
            if (blockOrder == 9) {
                elementHV.setV(9);
                elementHV.setH(3);
            }
        }
        if(block == 4) {
            if (blockOrder == 1) {
                elementHV.setV(1);
                elementHV.setH(4);
            }
            if (blockOrder == 2) {
                elementHV.setV(2);
                elementHV.setH(4);
            }
            if (blockOrder == 3) {
                elementHV.setV(3);
                elementHV.setH(4);
            }
            if (blockOrder == 4) {
                elementHV.setV(1);
                elementHV.setH(5);
            }
            if (blockOrder == 5) {
                elementHV.setV(2);
                elementHV.setH(5);
            }
            if (blockOrder == 6) {
                elementHV.setV(3);
                elementHV.setH(5);
            }
            if (blockOrder == 7) {
                elementHV.setV(1);
                elementHV.setH(6);
            }
            if (blockOrder == 8) {
                elementHV.setV(2);
                elementHV.setH(6);
            }
            if (blockOrder == 9) {
                elementHV.setV(3);
                elementHV.setH(6);
            }
        }
        if(block == 5) {
            if (blockOrder == 1) {
                elementHV.setV(4);
                elementHV.setH(4);
            }
            if (blockOrder == 2) {
                elementHV.setV(5);
                elementHV.setH(4);
            }
            if (blockOrder == 3) {
                elementHV.setV(6);
                elementHV.setH(4);
            }
            if (blockOrder == 4) {
                elementHV.setV(4);
                elementHV.setH(5);
            }
            if (blockOrder == 5) {
                elementHV.setV(5);
                elementHV.setH(5);
            }
            if (blockOrder == 6) {
                elementHV.setV(6);
                elementHV.setH(5);
            }
            if (blockOrder == 7) {
                elementHV.setV(4);
                elementHV.setH(6);
            }
            if (blockOrder == 8) {
                elementHV.setV(5);
                elementHV.setH(6);
            }
            if (blockOrder == 9) {
                elementHV.setV(6);
                elementHV.setH(6);
            }
        }
        if(block == 6) {
            if (blockOrder == 1) {
                elementHV.setV(7);
                elementHV.setH(4);
            }
            if (blockOrder == 2) {
                elementHV.setV(8);
                elementHV.setH(4);
            }
            if (blockOrder == 3) {
                elementHV.setV(9);
                elementHV.setH(4);
            }
            if (blockOrder == 4) {
                elementHV.setV(7);
                elementHV.setH(5);
            }
            if (blockOrder == 5) {
                elementHV.setV(8);
                elementHV.setH(5);
            }
            if (blockOrder == 6) {
                elementHV.setV(9);
                elementHV.setH(5);
            }
            if (blockOrder == 7) {
                elementHV.setV(7);
                elementHV.setH(6);
            }
            if (blockOrder == 8) {
                elementHV.setV(8);
                elementHV.setH(6);
            }
            if (blockOrder == 9) {
                elementHV.setV(9);
                elementHV.setH(6);
            }
        }
        if(block == 7) {
            if (blockOrder == 1) {
                elementHV.setV(1);
                elementHV.setH(7);
            }
            if (blockOrder == 2) {
                elementHV.setV(2);
                elementHV.setH(7);
            }
            if (blockOrder == 3) {
                elementHV.setV(3);
                elementHV.setH(7);
            }
            if (blockOrder == 4) {
                elementHV.setV(1);
                elementHV.setH(8);
            }
            if (blockOrder == 5) {
                elementHV.setV(2);
                elementHV.setH(8);
            }
            if (blockOrder == 6) {
                elementHV.setV(3);
                elementHV.setH(8);
            }
            if (blockOrder == 7) {
                elementHV.setV(1);
                elementHV.setH(9);
            }
            if (blockOrder == 8) {
                elementHV.setV(2);
                elementHV.setH(9);
            }
            if (blockOrder == 9) {
                elementHV.setV(3);
                elementHV.setH(9);
            }
        }
        if(block == 8) {
            if (blockOrder == 1) {
                elementHV.setV(4);
                elementHV.setH(7);
            }
            if (blockOrder == 2) {
                elementHV.setV(5);
                elementHV.setH(7);
            }
            if (blockOrder == 3) {
                elementHV.setV(6);
                elementHV.setH(7);
            }
            if (blockOrder == 4) {
                elementHV.setV(4);
                elementHV.setH(8);
            }
            if (blockOrder == 5) {
                elementHV.setV(5);
                elementHV.setH(8);
            }
            if (blockOrder == 6) {
                elementHV.setV(6);
                elementHV.setH(8);
            }
            if (blockOrder == 7) {
                elementHV.setV(4);
                elementHV.setH(9);
            }
            if (blockOrder == 8) {
                elementHV.setV(5);
                elementHV.setH(9);
            }
            if (blockOrder == 9) {
                elementHV.setV(6);
                elementHV.setH(9);
            }
        }
        if(block == 9) {
            if (blockOrder == 1) {
                elementHV.setV(7);
                elementHV.setH(7);
            }
            if (blockOrder == 2) {
                elementHV.setV(8);
                elementHV.setH(7);
            }
            if (blockOrder == 3) {
                elementHV.setV(9);
                elementHV.setH(7);
            }
            if (blockOrder == 4) {
                elementHV.setV(7);
                elementHV.setH(8);
            }
            if (blockOrder == 5) {
                elementHV.setV(8);
                elementHV.setH(8);
            }
            if (blockOrder == 6) {
                elementHV.setV(9);
                elementHV.setH(8);
            }
            if (blockOrder == 7) {
                elementHV.setV(7);
                elementHV.setH(9);
            }
            if (blockOrder == 8) {
                elementHV.setV(8);
                elementHV.setH(9);
            }
            if (blockOrder == 9) {
                elementHV.setV(9);
                elementHV.setH(9);
            }
        }
        return this.elementHV;
    }

    public SudokuElementDto() {
    }

    public ElementHV getElementHV() {
        return elementHV;
    }
}
