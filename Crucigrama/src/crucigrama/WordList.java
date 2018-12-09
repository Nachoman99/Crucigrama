/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 * this class handles a vector of words
 * 
 *@version 7/12/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class WordList {
    private Word[] wordList;
    private int counter;

    /**
     *
     */
    public WordList() {
        wordList = new Word[100];
    }

    /**
     *
     * @param wordList
     * @param counter
     */
    public WordList(Word[] wordList, int counter) {
        this.wordList = wordList;
        this.counter = counter;
    }

    /**
     *
     * @return
     */
    public Word[] getWordList() {
        return wordList;
    }

    /**
     *
     * @param wordList
     */
    public void setWordList(Word[] wordList) {
        this.wordList = wordList;
    }

    /**
     *
     * @return
     */
    public int getCounter() {
        return counter;
    }

    /**
     *
     * @param counter
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "WordList{" + "wordList=" + wordList + ", counter=" + counter + '}';
    }
    
    /**
     * public void addWord(Word word)
     * this method adds words to the vector
     * @param word the word to insert
     */
    public void addWord(Word word) {
        wordList[counter++] = word;
    }

    /**
     * public int getInitRow(int position)
     * this method returns the initial row of each word
     * @param position position of the vector to return
     * @return the initial row of each word
     */
    public int getInitRow(int position){
        return wordList[position].getInitRow();
    }
    
    /**
     * public int getInitColumn(int position)
     * this method returns the initial column of each word
     * @param position position of the vector to return
     * @return the initial column of each word
     */
    public int getInitColumn(int position){
        return wordList[position].getInitColumn();
    }

    /**
     * public int getIndex(int position)
     * this method returns the index of each word
     * @param position position of the vector to return
     * @return the index of each word
     */
    public int getIndex(int position){
        return wordList[position].getIndex();
    }

    /**
     * public char getVerticalHorizontal(int position)
     * this method returns if the word is vertical or horizontal
     * @param position position of the vector to return
     * @return if the word is vertical or horizontal
     */
    public char getVerticalHorizontal(int position){
        return wordList[position].getVerticalHorizontal();
    }

    /**
     * public String getWord(int position)
     * This method returns a word
     * @param position position of the vector to return
     * @return a word
     */
    public String getWord(int position){
        return wordList[position].getWord();
    }

    /**
     * public String getClue(int position)
     * this method returns a hint of a word
     * @param position position of the vector to return
     * @return hint of a word
     */
    public String getClue(int position){
        return wordList[position].getClue();
    }
    
    /**
     * public String getEspecificWord(int number)
     * this method returns a word with their respective data
     * @param number the position of the word
     * @return a word with their respective data
     */
     public String getEspecificWord(int number){
        return wordList[number].toString();
    }
}
