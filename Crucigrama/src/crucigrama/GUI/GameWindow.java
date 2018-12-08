/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama.GUI;

import crucigrama.Crossword;
import crucigrama.Game;
import crucigrama.Letter;
import crucigrama.LogicGame;
import filemanager.ReaderManagerText;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeCellEditor;
/**
 *
 * @author Kevin Trejos
 */
public class GameWindow extends javax.swing.JDialog {
    private String[] respuestasUsuario =new String[Game.WORD_LIST_MANAGER.getCounter()];
    private int contador =0;
    
    private JTextField txField;
    
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
            reader.open("Crosswords/LevelEasy/2.txt");
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
        
        ReaderManagerText reader2 = new ReaderManagerText(); 
        
         try {
            reader2.open("Crosswords/LevelEasy/2.txt");
            reader2.readAll();
            System.out.println(Game.WORD_LIST_MANAGER.getWordList());
            reader2.close(); //importante cerrar el archivo
            System.out.println("Lectura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        }
        
        Crossword crossword1 = new Crossword(rowColumn[0], rowColumn[1]);
        Crossword crossword2 = new Crossword(rowColumn[0], rowColumn[1]);
        LogicGame logic = new LogicGame();
        //logic.extraction(Game.WORD_LIST_MANAGER.getInitColumn(0),Game.WORD_LIST_MANAGER.getInitColumn(0) , Game.WORD_LIST_MANAGER.getVerticalHorizontal(0), crossword1);
        System.out.println(Game.WORD_LIST_MANAGER.getWord(0));
        System.out.println(Game.WORD_LIST_MANAGER.getWord(1));
        System.out.println(Game.WORD_LIST_MANAGER.getWord(2));
        System.out.println(Game.WORD_LIST_MANAGER.getWord(3));
        System.out.println(Game.WORD_LIST_MANAGER.getWord(4));
        System.out.println(Game.WORD_LIST_MANAGER.getClue(0));
        System.out.println(Game.WORD_LIST_MANAGER.getEspecificWord(0));
        System.out.println(Game.WORD_LIST_MANAGER.getEspecificWord(1));
        System.out.println(Game.WORD_LIST_MANAGER.getEspecificWord(2));
        System.out.println(Game.WORD_LIST_MANAGER.getEspecificWord(3));
        System.out.println(Game.WORD_LIST_MANAGER.getEspecificWord(4));
        
        for (int i = 0; i < Game.WORD_LIST_MANAGER.getCounter(); i++) {
             logic.addCrosswordEmpty(Game.WORD_LIST_MANAGER.getIndex(i),Game.WORD_LIST_MANAGER.getWord(i), Game.WORD_LIST_MANAGER.getInitRow(i), Game.WORD_LIST_MANAGER.getInitColumn(i), Game.WORD_LIST_MANAGER.getVerticalHorizontal(i), crossword1);
        }    
        
        initPanel(rowColumn ,crossword1, crossword2);
        showTracks();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        tpHorizontal = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tpVertical = new javax.swing.JTextPane();

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

        jScrollPane4.setViewportView(tpHorizontal);

        jScrollPane5.setViewportView(tpVertical);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnCrossword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 172, Short.MAX_VALUE)
                        .addComponent(jpCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnVerify)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
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
    
    private void showTracks(){
        String clueH = "";
        String clueV = "";
        int index = 0;
        String indexString = "";
        char verticalHorizontal;
        for (int i = 0; i < Game.WORD_LIST_MANAGER.getCounter(); i++) {
            verticalHorizontal = Game.WORD_LIST_MANAGER.getVerticalHorizontal(i);
            String verticalHorizontal2 = Character.toString(verticalHorizontal);

            if (verticalHorizontal2.equals("H")) {
                index = Game.WORD_LIST_MANAGER.getIndex(i);
                indexString = Integer.toString(index);
                clueH += indexString +". " + Game.WORD_LIST_MANAGER.getClue(i) + "\n";
                tpHorizontal.setText(clueH +"\n");
            }else if (verticalHorizontal2.equals("V")) {
                index = Game.WORD_LIST_MANAGER.getIndex(i);
                indexString = Integer.toString(index);
                clueV += indexString + ". " + Game.WORD_LIST_MANAGER.getClue(i) + "\n";
                tpVertical.setText(clueV+"\n");
            }
        }
    }
   
    private void initPanel(int[] rowColumn, Crossword crossword, Crossword respuestas){
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
                        String tx = txField.getText();
                        System.out.println(tx);
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
                
//                for (int k = 0; k < rows; k++) {
//                     for (int p = 0; p < columns; p++) {
//                         char letra; 
//                         letra = (txField.getText()).charAt(0);
//                         Letter newLetra = new Letter(letra);
//                        respuestas.setLetterPosition(k, p, newLetra);
//                        
//                    }
//                }
//                   
                /*
                txField.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        respuestasUsuario[contador]= txField.getText();
                        System.out.println("posicion especifica= "+respuestasUsuario[contador]);
                    }
                });
                contador +=1;
                */
            }
            
        }
        System.out.println(respuestas.print());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jpCrossword;
    private javax.swing.JPanel pnCrossword;
    private javax.swing.JTextPane tpHorizontal;
    private javax.swing.JTextPane tpVertical;
    // End of variables declaration//GEN-END:variables
}
