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
public class Crossword {
    private Letter[][] crossword;

    public Crossword() {
    }

    public Crossword(Letter[][] crossword) {
        this.crossword = crossword;
    }

    public Letter[][] getCrossword() {
        return crossword;
    }

    public void setCrossword(Letter[][] crossword) {
        this.crossword = crossword;
    }

    @Override
    public String toString() {
        return "Crossword{" + "crossword=" + crossword + '}';
    }
    
    
}
