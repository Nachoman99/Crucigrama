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
 * In this window the crossword puzzle is displayed for the easy level
 * 
 *@version 30/11/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class EasyLevelWindow extends javax.swing.JDialog {
    private Crossword respuestas1;
    private int attempts = 0;
    public static WordList palabrasIncorrectas= new WordList();
    private boolean [] countHelp;
    private int countsHelp;
    
    /**
     * Builder
     * Creates new form EasyLevelWindow
     * @param parent
     * @param modal
     */
    public EasyLevelWindow(javax.swing.JDialog parent, boolean modal) {
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
            Logger.getLogger(EasyLevelWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            Logger.getLogger(EasyLevelWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        ReaderManagerText reader2 = new ReaderManagerText(); 
        try {
            reader2.open("Crosswords/LevelEasy/1.txt");
            reader2.readAll();
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
        countHelp = new boolean[Game.WORD_LIST_MANAGER.getCounter()];
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

        btnHelp = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
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

        btnHelp.setText("Ayuda");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnVerify.setText("Verificar gane");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
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
                        .addComponent(pnCrossword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(62, 62, 62)
                        .addComponent(btnVerify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnVerify)
                    .addComponent(btnHelp))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
     * private void showTracks()
     * this method shows the clues to the user
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
     * private void initPanel(int[] rowColumn, Crossword crossword)
     * this method initializes the empty crossword so that the user can write the letters
     * @param rowColumn size of the matrix
     * @param crossword crossword with the words
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
                        }  
                        if((arg1.getKeyCode() != KeyEvent.VK_DELETE)){
                            if(Character.isLetter(car)){
                                String tx = "";
                                tx = txField.getText();
                                System.out.println(tx);
                                if (tx.length() >= 1){
                                    Letter letter = new Letter(tx.charAt(0));
                                    respuestas1.setLetterPosition(i_, j_, letter);
                                }else{ 
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
     * private void initPanel2(Crossword crossword)
     * This method verifies which words the user had bad and shows the word bad
     * @param crossword the crossword
     */
    private void initPanel2(Crossword crossword){
        int rows = crossword.rowLength();
        int columns = crossword.columnLength();
        GridLayout grid = new GridLayout(rows, columns);
        pnCrossword.removeAll();
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
                        }  
                        if((arg1.getKeyCode() != KeyEvent.VK_DELETE)){
                            if(Character.isLetter(car)){
                                String tx = "";
                                tx = txField.getText();
                                System.out.println(tx);
                                if (tx.length() >= 1){
                                    Letter letter = new Letter(tx.charAt(0));
                                    respuestas1.setLetterPosition(i_, j_, letter);
                                }else{                                
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
                for (int k = 0; k < palabrasIncorrectas.getCounter(); k++) {
                    if(i_ == palabrasIncorrectas.getInitRow(k)&& j_ ==palabrasIncorrectas.getInitColumn(k)){
                        txField.setBackground(Color.green); 
                    }           
                }
                pnCrossword.add(txField);          
            }
        }
           pnCrossword.updateUI();     
    }
    
    
    /**
     * check if the user won
     * @param evt the event that makes the button
     */
    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
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
                if(especificBadWord >0){
                   Word word5 = new Word(Game.WORD_LIST_MANAGER.getInitRow(i), Game.WORD_LIST_MANAGER.getInitColumn(i), Game.WORD_LIST_MANAGER.getIndex(i),Game.WORD_LIST_MANAGER.getVerticalHorizontal(i), Game.WORD_LIST_MANAGER.getWord(i), Game.WORD_LIST_MANAGER.getClue(i));
                    System.out.println(word5.toString());
                   palabrasIncorrectas.addWord(word5);
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
                        + "número de intento " + attempts);
                    initPanel2(respuestas1);
                }else if (attempts == 3) {
                    JOptionPane.showMessageDialog(this, "El crucigrama está incorrecto.\n"
                        + "Este es su último intento");
                    initPanel2(respuestas1);
                }else if (attempts > 3) {
                    JOptionPane.showMessageDialog(this, "Ha fallado 3 veces, no puede continuar");
                    Level level = new Level(this, true);
                    this.dispose();
                    level.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnVerifyActionPerformed

    /**
     * private void initPanel3(Crossword crossword, int random)
     * this method serves to show the help
     * @param crossword the crossword
     * @param random Random number
     */
    private void initPanel3(Crossword crossword, int random){
        int rows = crossword.rowLength();
        int columns = crossword.columnLength();
        GridLayout grid = new GridLayout(rows, columns);
        pnCrossword.removeAll();
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
                        }  
                        if((arg1.getKeyCode() != KeyEvent.VK_DELETE)){
                            if(Character.isLetter(car)){
                                String tx = "";
                                tx = txField.getText();
                                System.out.println(tx);
                                if (tx.length() >= 1){
                                    Letter letter = new Letter(tx.charAt(0));
                                    respuestas1.setLetterPosition(i_, j_, letter);
                                }else{ 
                                }
                            }else{
                                arg1.consume();
                            } 
                        }else{
                            arg1.consume();
                        }
                    }
                });
                String txt2 = respuestas1.getLetters(i, j).toString();
                txField.setText(txt2);
                if(txt.equals("0")){
                    txField.setBackground(Color.BLACK);
                    txField.setEnabled(false);
                    txField.setText("");
                }
                if(txt2.equals("0")){   
                    txField.setText(null);
                }
                if(countHelp[random] == false){ 
                    while(countHelp[random] == false && countsHelp ==Game.WORD_LIST_MANAGER.getCounter()){
                         random = (int)(Math.random()*(Game.WORD_LIST_MANAGER.getCounter()));
                    }   
                    if(i_ == Game.WORD_LIST_MANAGER.getInitRow(random)&& j_==Game.WORD_LIST_MANAGER.getInitColumn(random)){     
                        String letra = Game.WORD_LIST_MANAGER.getWord(random);
                        char letra2 = letra.charAt(0);
                        letra = Character.toString(letra2);
                        txField.setText(null);
                        txField.setText(letra);
                        txField.setForeground(Color.red);
                        Letter letter = new Letter(letra2);
                        respuestas1.setLetterPosition(i_, j_, letter);
                        countHelp[random] = true;
                        countsHelp +=1;   
                    }
                }
                pnCrossword.add(txField);          
            }
        }
        pnCrossword.updateUI();     
    }
    
    /**
     * this method makes the actions of the back button
     * @param evt a event
     */
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        LogicGame logic = new LogicGame();
        Crossword crossword2 = new Crossword(respuestas1.rowLength(), respuestas1.columnLength());
        for (int i = 0; i < Game.WORD_LIST_MANAGER.getCounter(); i++) {
             logic.addCrossword(Game.WORD_LIST_MANAGER.getWord(i), Game.WORD_LIST_MANAGER.getInitRow(i), Game.WORD_LIST_MANAGER.getInitColumn(i), Game.WORD_LIST_MANAGER.getVerticalHorizontal(i), crossword2);
        } 
        int random = (int)(Math.random()*(Game.WORD_LIST_MANAGER.getCounter()));
        initPanel3(crossword2, random);
    }//GEN-LAST:event_btnHelpActionPerformed
 
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
    * Ask if you are sure to leave and return to the main window 
    * if yes, if not stay in the same window
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
