/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama.GUI;

import crucigrama.Crossword;
import static crucigrama.GUI.EasyLevelWindow.palabrasIncorrectas;
import crucigrama.Game;
import crucigrama.Letter;
import crucigrama.LogicGame;
import crucigrama.Word;
import crucigrama.WordList;
import filemanager.ReaderManagerText;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
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
    private Crossword respuestas1;
    private int attempts = 0;
    
    /**
     * Creates new form MediumLevelWindow
     * @param parent
     * @param modal
     */
    public MediumLevelWindow(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
       ReaderManagerText reader = new ReaderManagerText(); 
        int[] rowColumn = new int[1];
    
        try {
            reader.open("Crosswords/LevelMedium/1.txt");
            rowColumn = reader.readRowColumn();
            reader.close();
            System.out.println("Lectura exitosa");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MediumLevelWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            Logger.getLogger(MediumLevelWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        ReaderManagerText reader2 = new ReaderManagerText(); 
        try {
            reader2.open("Crosswords/LevelMedium/1.txt");
            reader2.readAll();
            System.out.println(Game.WORD_LIST_MANAGER.getWordList());
            reader2.close();
            System.out.println("Lectura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
        }
        Crossword crossword1 = new Crossword(rowColumn[0], rowColumn[1]);
        Crossword crossword2 = new Crossword(rowColumn[0], rowColumn[1]);
        LogicGame logic = new LogicGame();
        for (int i = 0; i < Game.WORD_LIST_MANAGER.getCounter(); i++) {
             logic.addCrosswordEmpty(Game.WORD_LIST_MANAGER.getIndex(i),Game.WORD_LIST_MANAGER.getWord(i), Game.WORD_LIST_MANAGER.getInitRow(i), Game.WORD_LIST_MANAGER.getInitColumn(i), Game.WORD_LIST_MANAGER.getVerticalHorizontal(i), crossword1);
        }    
        for (int i = 0; i < Game.WORD_LIST_MANAGER.getCounter(); i++) {
             logic.addCrossword(Game.WORD_LIST_MANAGER.getWord(i), Game.WORD_LIST_MANAGER.getInitRow(i), Game.WORD_LIST_MANAGER.getInitColumn(i), Game.WORD_LIST_MANAGER.getVerticalHorizontal(i), crossword2);
        }
        initPanel(rowColumn ,crossword1);
        showTracks();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tpHorizontal = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpVertical = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
            .addGap(0, 380, Short.MAX_VALUE)
        );
        pnCrosswordLayout.setVerticalGroup(
            pnCrosswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        tpHorizontal.setEditable(false);
        jScrollPane1.setViewportView(tpHorizontal);

        tpVertical.setEditable(false);
        jScrollPane2.setViewportView(tpVertical);

        jLabel1.setText("Horizontales");

        jLabel2.setText("Verticales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(pnCrossword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(79, 79, 79)
                        .addComponent(btnVerify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnCrossword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHelp)
                    .addComponent(btnVerify)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * check if the user won
 * @param evt a event
 */
    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        int countBadWords = 0;
        String[] respuestaUsuario = new String[Game.WORD_LIST_MANAGER.getCounter()];
        LogicGame logic = new LogicGame();
        boolean isEmpty = false;
        int badWords = 0;
        for (int i = 0; i < Game.WORD_LIST_MANAGER.getCounter(); i++) {
            respuestaUsuario[i] = logic.extraction(Game.WORD_LIST_MANAGER.getInitRow(i), Game.WORD_LIST_MANAGER.getInitColumn(i), Game.WORD_LIST_MANAGER.getVerticalHorizontal(i), respuestas1);
            System.out.println(Arrays.toString(respuestaUsuario));
            if(respuestaUsuario[i].length() < Game.WORD_LIST_MANAGER.getWord(i).length()){
                isEmpty = true;
            }else{
                isEmpty = false;
            }
        }      
        for (int i = 0; i <  Game.WORD_LIST_MANAGER.getCounter(); i++) {
            int especificBadWord = 0;
            System.out.println(Game.WORD_LIST_MANAGER.getWord(i)+"=="+respuestaUsuario[i]);
            if(respuestaUsuario[i].length() < Game.WORD_LIST_MANAGER.getWord(i).length()){
                badWords +=1;
            }else{
                badWords += logic.validar(respuestaUsuario[i].toUpperCase(), Game.WORD_LIST_MANAGER.getWord(i).toUpperCase()); 
                especificBadWord = logic.validar(respuestaUsuario[i].toUpperCase(), Game.WORD_LIST_MANAGER.getWord(i).toUpperCase());
                if(especificBadWord > 0){
                   Word word5 = new Word(Game.WORD_LIST_MANAGER.getInitRow(i), Game.WORD_LIST_MANAGER.getInitColumn(i), Game.WORD_LIST_MANAGER.getIndex(i),Game.WORD_LIST_MANAGER.getVerticalHorizontal(i), Game.WORD_LIST_MANAGER.getWord(i), Game.WORD_LIST_MANAGER.getClue(i));
                    System.out.println(word5.toString());
                   palabrasIncorrectas.addWord(word5);
                   countBadWords +=1;
                }
            }
            System.err.println(badWords);
        }
        if (isEmpty == true) {
            JOptionPane.showMessageDialog(this, "Por favor rellene todo el crucigrama");
        } else if(isEmpty == false){
            if (badWords == 0) {
                JOptionPane.showMessageDialog(this, "Felicidades, ha ganado");
                Level level = new Level(this, true);
                this.dispose();
                level.setVisible(true);
            }else if(badWords >= 1){
                attempts ++;
                if (attempts < 3) {
                    JOptionPane.showMessageDialog(this, "El crucigrama está incorrecto\n"
                        + "número de intento " + attempts+"\n" + "Y tiene "+countBadWords+" palabra malas");
                }else if (attempts == 3) {
                    JOptionPane.showMessageDialog(this, "El crucigrama está incorrecto.\n"
                        + "Este es su último intento"+"\n" + "Y tiene "+countBadWords+" palabra malas");
                
                }else if (attempts > 3) {
                    JOptionPane.showMessageDialog(this, "Ha fallado 3 veces, no puede continuar");
                    Level level = new Level(this, true);
                    this.dispose();
                    level.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed

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
            Game.WORD_LIST_MANAGER = new WordList();
            this.dispose();
            level.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * this method shows the clues
     */
    private void showTracks(){
         String[] charSimbol = {"☺","☻","♥","♦","♣","•","◘","♪","♫","☼","►","◄","↕","‼","╦","╔","$","↔","╣","+","╝","§","○","◙","♀"};
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
                 indexString = charSimbol[index-1];
                clueH += indexString +". " + Game.WORD_LIST_MANAGER.getClue(i) + "\n";
                tpHorizontal.setText(clueH +"\n");
            }else if (verticalHorizontal2.equals("V")) {
                index = Game.WORD_LIST_MANAGER.getIndex(i);
                indexString = charSimbol[index-1];
                clueV += indexString + ". " + Game.WORD_LIST_MANAGER.getClue(i) + "\n";
                tpVertical.setText(clueV+"\n");
            }
        }
    }
    
    /**
     * Will start the crossword puzzle
     * @param crossword 
     */
    private void initPanel(int[] rowColumn, Crossword crossword){
        int rows = rowColumn[0];
        int columns = rowColumn[1];
        respuestas1 = new Crossword(rows, columns);
        GridLayout grid = new GridLayout(rows, columns);
        pnCrossword.setLayout(grid);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int i_= i;
                int j_ = j;
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
                    }
                    
                    @Override
                    public void keyPressed(java.awt.event.KeyEvent arg2) {
                    }

                    @Override
                    public void keyReleased(java.awt.event.KeyEvent arg1) {
                        int limite = 1;
                        char car = arg1.getKeyChar();
                        if(txField.getText().length() == limite){
                            arg1.consume();
                            System.out.println("Hola");
                        }  
                        if((arg1.getKeyCode() != KeyEvent.VK_DELETE)){
                            System.out.println("PIO");
                            if(Character.isLetter(car)){
                                System.out.println("Juan perez");
                                String tx = "";
                                tx = txField.getText();
                                System.out.println(tx);
                                if (tx.length() >= 1){
                                    System.out.println("vacio");
                                    Letter letter = new Letter(tx.charAt(0));
                                    respuestas1.setLetterPosition(i_, j_, letter);
                                }else{
                                    System.out.println("No vacio"); 
                                }
                            }else{
                                arg1.consume();
                            } 
                        }else{
                            arg1.consume();
                        }
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
                @Override
                public void windowClosing(WindowEvent e){
                    confirm();
                }
            });
        } catch (Exception e) {
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
            Game.WORD_LIST_MANAGER = new WordList();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnCrossword;
    private javax.swing.JTextPane tpHorizontal;
    private javax.swing.JTextPane tpVertical;
    // End of variables declaration//GEN-END:variables
}
