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
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Letter A = new Letter('A');
        Letter R = new Letter('R');
        Letter O = new Letter('O');
        Letter Z = new Letter('Z');
        Letter T = new Letter('T');
        Letter U = new Letter('U');
        Letter N = new Letter('N');

        
        Crossword crossword1 = new Crossword(6, 7);
        crossword1.setLetterPosition(1, 1, A);
        crossword1.setLetterPosition(1, 2, R);
        crossword1.setLetterPosition(1, 3, R);
        crossword1.setLetterPosition(1, 4, O);
        crossword1.setLetterPosition(1, 5, Z);
        crossword1.setLetterPosition(2, 1, T);
        crossword1.setLetterPosition(3, 1, U);
        crossword1.setLetterPosition(4, 1, N);
        System.out.println(crossword1.print());
        
    }
    
}
