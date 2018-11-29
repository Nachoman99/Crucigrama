/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

import javax.swing.JTextArea;


/**
 *
 * @author Nacho
 */
public class GridTextArea extends JTextArea{
    
    private Letter letter;
    
    public GridTextArea(Letter letter) {
        super(letter.toString());
        this.letter = letter;
    }

    public Letter getProduct() {
        return letter;
    }

    
}
