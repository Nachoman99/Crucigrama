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
    
    Letter[] letter;

    public Word(Letter[] letter) {
        this.letter = letter;
    }

    public Letter[] getLetter() {
        return letter;
    }

    public void setLetter(Letter[] letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Word{" + "letter=" + letter + '}';
    }
    
    
}
