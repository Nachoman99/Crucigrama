/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama.GUI;

import crucigrama.Crossword;
import crucigrama.Letter;
import filemanager.ReaderManagerText;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeCellEditor;
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
        
        ReaderManagerText reader = new ReaderManagerText(); 
        int[] rowColumn = new int[1];
    
        try {
            reader.open("Crosswords/LevelEasy/1.txt");
            rowColumn = reader.readRowColumn();
            reader.close();
            System.out.println("Lectura exitosa");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        Crossword crossword1 = new Crossword(rowColumn[0], rowColumn[1]);
        
        
        initPanel(rowColumn ,crossword1);
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
        btnVerify = new javax.swing.JButton();
        pnCrossword = new javax.swing.JPanel();

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

        btnVerify.setText("Verificar gane");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
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
            .addGap(0, 275, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(jpCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnVerify)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(pnCrossword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        //String txt = tfCrossword.getText();
        //Letter[] letter = crossword.stringToLetter(txt);
        int wrong = 0;
      //  int wrong = crossword.validar(letter, palabraCorrecta);//En palabraCorrecta va el archivo
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
    private void maximunLetter(KeyEvent evt) {                                   
        // TODO add your handling code here:
        JTextField txfielField = new JTextField();
        int limite = 1;
        if (txfielField.getText().length()== limite){ 
            evt.consume();
        }
        
        ReaderManagerText reader = new ReaderManagerText(); 
        int[] rowColumn;
    
        try {
            reader.open("Crossword/LevelVeryHard/crossword1.txt");
            rowColumn = reader.readRowColumn();
            reader.close();
            System.out.println("Lectura exitosa");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }        
   
    private void initPanel(int[] rowColumn, Crossword crossword){
        int rows = rowColumn[0];
        int columns = rowColumn[1];
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jpCrossword;
    private javax.swing.JPanel pnCrossword;
    // End of variables declaration//GEN-END:variables
}
