/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 *
 * @author Nacho
 */
public class Letter {
    private char letter;

    public Letter() {
        this('0');
    }

    public Letter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Letter{" + "letter=" + letter + '}';
    }
    
    
}
