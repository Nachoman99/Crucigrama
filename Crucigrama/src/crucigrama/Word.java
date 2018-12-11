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
     * @param clue
     * @param word
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
     * Builder
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
     * get
     * @return initRow
     */
    public int getInitRow() {
        return initRow;
    }

    /**
     * set
     * @param initRow initRow
     */
    public void setInitRow(int initRow) {
        this.initRow = initRow;
    }

    /**
     * get
     * @return initColumn
     */
    public int getInitColumn() {
        return initColumn;
    }

    /**
     * set
     * @param initColumn initColumn
     */
    public void setInitColumn(int initColumn) {
        this.initColumn = initColumn;
    }

    /**
     *get
     * @return 
     */
    public int getIndex() {
        return index;
    }

    /**
     *set
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     *get
     * @return 
     */
    public char getVerticalHorizontal() {
        return verticalHorizontal;
    }

    /**
     *set
     * @param verticalHorizontal
     */
    public void setVerticalHorizontal(char verticalHorizontal) {
        this.verticalHorizontal = verticalHorizontal;
    }

    /**
     *get
     * @return 
     */
    public String getWord() {
        return word;
    }

    /**
     *set
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     *get
     * @return 
     */
    public String getClue() {
        return clue;
    }

    /**
     *set
     * @param clue
     */
    public void setClue(String clue) {
        this.clue = clue;
    }

    /**
     *toString
     * @return 
     */
    @Override
    public String toString() {
        return "Word{" + "initRow=" + initRow + ", initColumn=" + initColumn + ", index=" + index + ", verticalHorizontal=" + verticalHorizontal + ", word=" + word + ", clue=" + clue + '}';
    }
}
