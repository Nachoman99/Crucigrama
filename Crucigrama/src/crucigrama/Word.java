/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 *
 * @author Kevin Trejos
 */
public class Word {
    int initRow;
    int initColumn;
    int index;
    char verticalHorizontal;
    String word;
    String clue;

    public Word() {
    }
    
    public Word(int initRow, int initColumn){
        this.initRow = initRow;
        this.initColumn = initColumn;
    }
    public Word(int initRow, int initColumn, int index, char verticalHorizontal, String word, String clue) {
        this.initRow = initRow;
        this.initColumn = initColumn;
        this.index = index;
        this.verticalHorizontal = verticalHorizontal;
        this.word = word;
        this.clue = clue;
    }

    public int getInitRow() {
        return initRow;
    }

    public void setInitRow(int initRow) {
        this.initRow = initRow;
    }

    public int getInitColumn() {
        return initColumn;
    }

    public void setInitColumn(int initColumn) {
        this.initColumn = initColumn;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public char getVerticalHorizontal() {
        return verticalHorizontal;
    }

    public void setVerticalHorizontal(char verticalHorizontal) {
        this.verticalHorizontal = verticalHorizontal;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    @Override
    public String toString() {
        return "Word{" + "initRow=" + initRow + ", initColumn=" + initColumn + ", index=" + index + ", verticalHorizontal=" + verticalHorizontal + ", word=" + word + ", clue=" + clue + '}';
    }
}
