/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 * This class handles the letters
 * 
 *@version 29/11/2018
 * @author Jose Ignacio Zamora/Edwin Molina/Kevin Trejos
 */
public class Letter {
    private char letter;

    /**
     * Builder
     */
    public Letter() {
        this('0');
    }

    /**
     * Builder
     * @param letter
     */
    public Letter(char letter) {
        this.letter = letter;
    }

    /**
     * Get
     * @return letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     *set
     * @param letter a letter
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }

    /**
     * toString
     * @return toString
     */
    @Override
    public String toString() {
        return letter + "";
    }
}
