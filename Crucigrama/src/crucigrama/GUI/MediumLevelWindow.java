/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama.GUI;

import crucigrama.Crossword;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *In this window the crossword puzzle is displayed for the medium level
 * 
 * @version 30/11/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class MediumLevelWindow extends javax.swing.JDialog {

    /**
     * Creates new form MediumLevelWindow
     */
    public MediumLevelWindow(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
       // initPanel();
       closeX();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerify = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnCrossword = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnVerify.setText("Verificar gane");
        btnVerify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        btnHelp.setText("Ayuda");
        btnHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCrosswordLayout = new javax.swing.GroupLayout(pnCrossword);
        pnCrossword.setLayout(pnCrosswordLayout);
        pnCrosswordLayout.setHorizontalGroup(
            pnCrosswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnCrosswordLayout.setVerticalGroup(
            pnCrosswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnCrossword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(62, 62, 62)
                        .addComponent(btnVerify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(btnHelp)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerify)
                    .addComponent(btnHelp)
                    .addComponent(btnBack))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        /*
        deberá indicar la
        cantidad   de   palabras   que   tienen   algún   error.  
        */
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        /*
        se completará una letra de forma aleatoria de una palabra
aleatoria, si ya se ha completado una letra de esa palabra se realizará para otra palabra. Cuando se ha
completado   una   letra   en   todas   las   palabras   ya   no   será   posible   solicitar   más   ayuda,   lo   que   debe
indicarse mediante un mensaje al usuario al presionar el botón de ayuda.  
        */
    }//GEN-LAST:event_btnHelpActionPerformed

    /**
     * Close the current window and open the previous window, asking first 
     * if you want to exit
     * @param evt the event that makes the button
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Level level = new Level(this, true);
        int option;
        option = JOptionPane.showConfirmDialog(this, "Está seguro que desea volver, perderá su progreso", "VOLVER", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            this.dispose();
            level.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * Will start the crossword puzzle
     * @param crossword 
     */
    private void initPanel(Crossword crossword){
        int rows = crossword.rowlength();
        int columns = crossword.columnLength();
        GridLayout grid = new GridLayout(rows, columns);
        pnCrossword.setLayout(grid);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String txt = crossword.getLetters(i, j).toString();
                JTextField txField = new JTextField(txt, 1);
                if(txt.equals(" ")){
                    txField.setText(null);
                }
                txField.addKeyListener(new java.awt.event.KeyListener() {
                    @Override
                    public void keyTyped(java.awt.event.KeyEvent e) {
                        int limite = 1;
                        if(txField.getText().length() == limite){
                            e.consume();
                        }
                        char car = e.getKeyChar();
                        if(Character.isLetter(car)){
                        
                        }else{
                           e.consume();
                        }
                    }
                    @Override
                    public void keyPressed(java.awt.event.KeyEvent arg2) {
                    }

                    @Override
                    public void keyReleased(java.awt.event.KeyEvent arg1) {
                    }
                });
                if(txt.equals("0")){
                    txField.setBackground(Color.BLACK);
                    txField.setEnabled(false);
                    txField.setText("");
                }
                pnCrossword.add(txField);
            }
        }
       
    }
    
    /**
     * Pressing the X returns to the main window
     */
    private void closeX(){
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    confirm();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Ask if you are sure to leave and return to the main window if yes, 
     * if not stay in the same window
     */
    private void confirm(){
        Welcome welcome = new Welcome();
        int result;
        result = JOptionPane.showConfirmDialog(this, "Está seguro que desea salir, perderá su progreso", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            this.dispose();
            welcome.setVisible(true);
        }else{
            this.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnVerify;
    private javax.swing.JPanel pnCrossword;
    // End of variables declaration//GEN-END:variables
}
