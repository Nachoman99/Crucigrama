/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

import java.util.Arrays;

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
        Letter[] ejemplo = {A,T,U,N};
        Letter[] malo = {A,R,O,Z};
        Letter[] prueba = {N,U,A, O};
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
        System.out.println(crossword1.validar(ejemplo, ejemplo));
        System.out.println(crossword1.extraction(1, 1, 'V'));
        System.out.println(crossword1.extraction(1, 1, 'H'));
        
        
        String palabra1 = crossword1.extraction(1, 1, 'V');  
        String palabra2 = crossword1.extraction(1, 1, 'H'); 
        Letter[] palabra3 = crossword1.stringToLetter(palabra1);
        System.out.println("Pruba final= "+ Arrays.toString(palabra3));//puse el Arrays solo para probar no usarlo 
        palabra3 = crossword1.stringToLetter(palabra2);
        System.out.println("Pruba final= "+ Arrays.toString(palabra3));
    }
    
}
