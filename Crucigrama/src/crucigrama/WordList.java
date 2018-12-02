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
    private Word wordList;

    public WordList() {
    }

    public WordList(Word wordList) {
        this.wordList = wordList;
    }

    public Word getWordList() {
        return wordList;
    }

    public void setWordList(Word wordList) {
        this.wordList = wordList;
    }

    @Override
    public String toString() {
        return "WordList{" + "wordList=" + wordList + '}';
    }
    
    
}
