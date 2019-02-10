package com.kodilla.sudoku.solution;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuElement;
import com.kodilla.sudoku.board.SudokuElementDto;

import java.util.ArrayList;

public class Solution {
    boolean elementWasAdded = false;
    public static SudokuElement elementForClone = new SudokuElement();
    public final static int MIN_INDEX = 1;
    public final static int MAX_INDEX = 9;
    public ArrayList<Integer> allNumbers;
    SudokuBoard board;
    SudokuElementDto sudokuElementDto = new SudokuElementDto();
    public int sum;

    public Solution(SudokuBoard board) {
        this.board = board;
        setAllNumbers();
    }

    public void setAllNumbers() {
        this.allNumbers = new ArrayList<>();
        for(Integer i = 1; i < 10; i++) {
            this.allNumbers.add(i);
        }
    }

    public ArrayList<Integer> getAllNumbers() {
        return allNumbers;
    }

    public boolean isZero(int v, int h) {
        setAllNumbers();
        boolean zero = true;
        if(board.getBoard().get(h-1).getRow().get(v-1).getValue() == 0) {
            for(int x = MIN_INDEX; x <= MAX_INDEX; x ++) {
                numberToElement(x,h);
                System.out.println("Checking (x:h)=(" + x + ":" + h + ") -> " + getAllNumbers());
            }
            for(int y = MIN_INDEX; y <= MAX_INDEX; y ++) {
                numberToElement(v,y);
                System.out.println("Checking (v:y)=(" + v + ":" + y + ") -> " + getAllNumbers());
            }
            for(int bO = MIN_INDEX; bO <= MAX_INDEX; bO++) {
                int b = board.getBlocks(v,h);
                sudokuElementDto.fromBlocksToHV(board.getBlocks(v,h), bO);
                numberToElement(sudokuElementDto.getElementHV().getV(),sudokuElementDto.getElementHV().getH());
                System.out.println("Checking (b:bO)=(" + b + ":" + bO + ") -> " + getAllNumbers());
            }
            addElementToBoard(v,h);
            setElementforClone(board.getBlocks(v,h),board.getBlockOrder(v,h),allNumbers);
            setElementForCloneValue(0);
        } else {
            sum = sum + board.getBoard().get(h-1).getRow().get(v-1).getValue();
//            System.out.println("suma -> " + sum);
            zero = false;
        }

        return zero;
    }

    public int getSum() {
        return sum;
    }

    public void setSum() {
        this.sum = 0;
    }

    public void addElementToBoard(int v, int h) {
        if(allNumbers.size() == 1) {
            board.setElement(v, h, allNumbers.get(0));
            elementWasAdded = true;
//            System.out.println("Aded element -> " + board.getElement(v,h) + " On -> " + v + ":" +h);
        }
    }

    public boolean numberToElement(int v, int h) {

        if(this.allNumbers.contains(board.getBoard().get(h-1).getRow().get(v-1).getValue())) {
            this.allNumbers.remove(allNumbers.indexOf(board.getBoard().get(h-1).getRow().get(v-1).getValue()));
            return false;
        }
        if(this.allNumbers.size() == 1) {
            return true;
        }
        return false;
    }

    public void setElementforClone(int block, int blockOrder, ArrayList<Integer> cloneVar){
        elementForClone.setBlock(block);
        elementForClone.setBlockOrder(blockOrder);
        elementForClone.setCloneVarations(cloneVar);
        sudokuElementDto.fromBlocksToHV(elementForClone.getBlock(),elementForClone.getBlockOrder());
        System.out.println("Cloned element -> (x;y)=(" + sudokuElementDto.getElementHV().getV() + ":" + sudokuElementDto.getElementHV().getH() + ") -> " + elementForClone.getCloneVarations());
//        elementForClone.setValue(elementForClone.getCloneVarations().get(cloneVarationsOrder));
    }

    public void setElementForCloneValue(int index) {
        elementForClone.setValue(elementForClone.getCloneVarations().get(index));
        System.out.println(elementForClone.getValue());
    }

    public SudokuBoard resolveClone() {
        System.out.println("Sklonowana");

        SudokuBoard deepCloneBoard = null;
        try{
            deepCloneBoard = board.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        sudokuElementDto.fromBlocksToHV(elementForClone.getBlock(),elementForClone.getBlockOrder());
        setElementForCloneValue(1); //powinno być 0, jeśli wyskoczy błąd to znaczy że zła wartość
        deepCloneBoard.setElement(sudokuElementDto.getElementHV().getV(),sudokuElementDto.getElementHV().getH(),elementForClone.getValue());
        System.out.println(deepCloneBoard);



        return deepCloneBoard;
    }

    public void resolve() {
        boolean end = false;
        while (!end) {
            for (int y = MIN_INDEX; y <= MAX_INDEX; y++) {
                for (int x = MIN_INDEX; x <= MAX_INDEX; x++) {
                    System.out.println("Checking -> " + x + ":" + y);
                    isZero(x, y);
                }
            }
            System.out.println("Suma -> " + getSum());
            if(getSum() == 405){
                end = true;
            } else {
                setSum();
            }
            System.out.println("Suma -> " + getSum());
            System.out.println("Aded element -> " + elementWasAdded);
            if(!elementWasAdded & getSum() < 405) {
                end = true;
                resolveClone();
            }
            elementWasAdded = false;
        }
        System.out.println("Pierwotna");
        System.out.print(board);


    }
}
