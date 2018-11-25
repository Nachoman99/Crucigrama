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

    public Crossword(int row, int column) {
        crossword = new Letter[row][column];
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
    
    public void setLetterPosition(int row, int column, Letter letter){
        crossword[row][column] = letter;
    }
    
    public String print(){
        String print ="";
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[0].length; j++) {
                print += " ("+crossword[i][j].getLetter()+")";
            }
            print += "\n";
        }
        return print;
    }
}
