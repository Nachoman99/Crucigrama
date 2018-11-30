/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama.GUI;

import crucigrama.GUI.Verify;
import crucigrama.Crossword;
import crucigrama.GridTextArea;
import crucigrama.Letter;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin Trejos
 */
public class GameWindow extends javax.swing.JDialog {
    
    /**
     * Creates new form Cuadricula
     */
    public GameWindow(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        
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
        
        initPanel(crossword1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jpCrossword = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpCrossword = new javax.swing.JTextPane();
        btnVerify = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jpCrosswordLayout = new javax.swing.GroupLayout(jpCrossword);
        jpCrossword.setLayout(jpCrosswordLayout);
        jpCrosswordLayout.setHorizontalGroup(
            jpCrosswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jpCrosswordLayout.setVerticalGroup(
            jpCrosswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(tpCrossword);

        btnVerify.setText("Verificar gane");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnVerify)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(btnVerify)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        //Hacer un método para verificar gane
        Crossword crossword = new Crossword();
        String txt = tpCrossword.getText();
        Letter[] letter = crossword.stringToLetter(txt);
        int wrong = crossword.validar(letter, palabraCorrecta);//En palabraCorrecta va el archivo
        if (wrong == 0) {
            JOptionPane.showMessageDialog(this, "FELICIDADES HA GANADO ESTE NIVEL");
            Level level = new Level(this, true);
            level.setVisible(true);
        }else{//acciones si el mae no contesta bien
            
        }
        //En   el   caso   de   faltar   alguna   letra   por   ingresar   no   se
        //realizará la revisión y se le indicará con el mensaje correspondiente al usuario.
        //Hacer un método para verificar que ningún espacio es null
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void initPanel(Crossword crossword){
        int rows = crossword.rowlength();
        int columns = crossword.columnLength();
        GridLayout grid = new GridLayout(rows, columns);
        tpCrossword.setLayout(grid);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                GridTextArea newGridTextArea = new GridTextArea(crossword.getLetters(i, j));
                tpCrossword.add(newGridTextArea);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jpCrossword;
    private javax.swing.JTextPane tpCrossword;
    // End of variables declaration//GEN-END:variables
}
