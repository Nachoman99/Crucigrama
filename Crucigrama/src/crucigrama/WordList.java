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
public class WordList {
    private Word[] wordList;
    private int counter;

    public WordList() {
        wordList = new Word[100];
    }

    public WordList(Word[] wordList, int counter) {
        this.wordList = wordList;
        this.counter = counter;
    }

    public Word[] getWordList() {
        return wordList;
    }

    public void setWordList(Word[] wordList) {
        this.wordList = wordList;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "WordList{" + "wordList=" + wordList + ", counter=" + counter + '}';
    }
}
