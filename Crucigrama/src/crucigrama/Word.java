/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 * this class handles everything related to the words of the crossword
 * 
 *@version 7/12/2018
 * @author Kevin Trejos, Jose Ignacio Zamora, Edwin Molina
 */


public class Word {
    int initRow;
    int initColumn;
    int index;
    char verticalHorizontal;
    String word;
    String clue;

    /**
     * Builder
     */
    public Word() {
        this(0,0,0,' ',"","");
    }
    
    /**
     * Builder
     * @param initRow initial row
     * @param initColumn initial column
     */
    public Word(int initRow, int initColumn){
        this.initRow = initRow;
        this.initColumn = initColumn;
    }

    /**
     * Builder
     * @param initRow
     * @param initColumn
     * @param index
     * @param verticalHorizontal
     * @param word
     * @param clue
     */
    public Word(int initRow, int initColumn, int index, char verticalHorizontal, String word, String clue) {
        this.initRow = initRow;
        this.initColumn = initColumn;
        this.index = index;
        this.verticalHorizontal = verticalHorizontal;
        this.word = word;
        this.clue = clue;
    }

    /**
     *
     * @param index
     * @param verticalHorizontal
     * @param word
     * @param clue
     */
    public Word(int index, char verticalHorizontal, String word, String clue) {
        this.index = index;
        this.verticalHorizontal = verticalHorizontal;
        this.word = word;
        this.clue = clue;
    }
    
    /**
     *
     * @return
     */
    public int getInitRow() {
        return initRow;
    }

    /**
     *
     * @param initRow
     */
    public void setInitRow(int initRow) {
        this.initRow = initRow;
    }

    /**
     *
     * @return
     */
    public int getInitColumn() {
        return initColumn;
    }

    /**
     *
     * @param initColumn
     */
    public void setInitColumn(int initColumn) {
        this.initColumn = initColumn;
    }

    /**
     *
     * @return
     */
    public int getIndex() {
        return index;
    }

    /**
     *
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     *
     * @return
     */
    public char getVerticalHorizontal() {
        return verticalHorizontal;
    }

    /**
     *
     * @param verticalHorizontal
     */
    public void setVerticalHorizontal(char verticalHorizontal) {
        this.verticalHorizontal = verticalHorizontal;
    }

    /**
     *
     * @return
     */
    public String getWord() {
        return word;
    }

    /**
     *
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     *
     * @return
     */
    public String getClue() {
        return clue;
    }

    /**
     *
     * @param clue
     */
    public void setClue(String clue) {
        this.clue = clue;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Word{" + "initRow=" + initRow + ", initColumn=" + initColumn + ", index=" + index + ", verticalHorizontal=" + verticalHorizontal + ", word=" + word + ", clue=" + clue + '}';
    }
}
