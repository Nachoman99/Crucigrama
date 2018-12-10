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
import users.User;

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
    private int progressCrossword;
    private int positionUser;
    
    /**
     * Builder
     * Creates new form EasyLevelWindow
     */
    public EasyLevelWindow(javax.swing.JDialog parent, boolean modal) {
         super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
       ReaderManagerText reader = new ReaderManagerText(); 
        int[] rowColumn = new int[1];
    
        User user = new User();
        progressCrossword = Game.USER_LIST_MANAGER.getProgressEasy(user.getUserCode());
        System.out.println(progressCrossword);
        if (progressCrossword == 0) {
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
            ReaderManagerText reader2 = new ReaderManagerText(); 
            try {
                reader2.open("Crosswords/LevelEasy/1.txt");
                reader2.readAll();
                reader2.close(); //importante cerrar el archivo
                System.out.println("Lectura exitosa");
            } catch (IOException ex) {
                System.err.println("error de archivo");
                System.err.println(ex.getMessage());
                //ex.printStackTrace();
            }
}else{
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
                reader2.close(); //importante cerrar el archivo
                System.out.println("Lectura exitosa");
            } catch (IOException ex) {
                System.err.println("error de archivo");
                System.err.println(ex.getMessage());
                //ex.printStackTrace();
            }
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
    
    public void userSelected(int index){
        positionUser = index;
        
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
                //indexString = Integer.toString(index);
                clueH += indexString +". " + Game.WORD_LIST_MANAGER.getClue(i) + "\n";
                tpHorizontal.setText(clueH +"\n");
            }else if (verticalHorizontal2.equals("V")) {
                index = Game.WORD_LIST_MANAGER.getIndex(i);
                indexString = charSimbol[index-1];
//                indexString = Integer.toString(index);
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
        LogicGame logic = new LogicGame();
        
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
//                        char car = e.getKeyChar();
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
//                                    Letter letter = new Letter(tx.charAt(0));
//                                    respuestas1.setLetterPosition(i_, j_, letter); 
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
    
    private void initPanel2(Crossword crossword){
        LogicGame logic = new LogicGame();
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
//                        char car = e.getKeyChar();
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
//                                    Letter letter = new Letter(tx.charAt(0));
//                                    respuestas1.setLetterPosition(i_, j_, letter); 
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
                
                
//                int i_= i;
//                int j_= j;
//          
//                String txt = crossword.getLetters(i, j).toString();
//                JTextField txField = new JTextField(txt, 1);
//                if(txt.equals(" ")){
//                    txField.setText(null);
//                }
//                
//                for (int k = 0; k < palabrasIncorrectas.getCounter(); k++) {
//                    if(i_ == palabrasIncorrectas.getInitRow(k)|| j_ ==palabrasIncorrectas.getInitColumn(k)){
//                        txField.setBackground(Color.green); 
//                    }           
//                }
//                 pnCrossword.add(txField);   
//            }
//        }
//       pnCrossword.updateUI();
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
            //mostrar el número de palabras malas
            //Llamar de nuevo al initPanel con un párametro que reciba las palabras malas y las resalte, eso sería en el initPanel
            //aquí solo debería llamar a ese método y mandarle por párametro las palabrasMalas
            }
        }
        System.out.println(respuestas1.print());
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void initPanel3(Crossword crossword, int random){
        
        LogicGame logic = new LogicGame();
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
//                        char car = e.getKeyChar();
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
//                for (int k = 0; k < palabrasIncorrectas.getCounter(); k++) {
//                    if(i_ == palabrasIncorrectas.getInitRow(k)&& j_ ==palabrasIncorrectas.getInitColumn(k)){
//                        txField.setBackground(Color.green); 
//                    }           
//                } 
                 
                
                
                System.out.println("Random= "+ random);
                System.out.println("Numero= "+countHelp[random]);
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
                
               
        
//                if(countHelp[random] == true){
//                    if(i_ == Game.WORD_LIST_MANAGER.getInitRow(random)&& j_==Game.WORD_LIST_MANAGER.getWord(random).length()-1){
//                        
//                            if(Game.WORD_LIST_MANAGER.getVerticalHorizontal(random)== 'H'){
//                               String letra = Game.WORD_LIST_MANAGER.getWord(random);
//                                char letra2 = letra.charAt(Game.WORD_LIST_MANAGER.getWord(random).length()-1);
//                                letra = Character.toString(letra2);
//                                txField.setText(null);
//                                txField.setText(letra);
//                                txField.setForeground(Color.red);
//                                Letter letter = new Letter(letra2);
//                               respuestas1.setLetterPosition(i_,Game.WORD_LIST_MANAGER.getWord(random).length()-1 , letter);
//                               countHelp[random] = true;
//                           }
//                        }   
//                        
//                    }
//                if(countHelp[random] == true){     
//                    if(i_ == Game.WORD_LIST_MANAGER.getWord(random).length()-1 && j_==Game.WORD_LIST_MANAGER.getInitColumn(random)){
//                        
//                            if(Game.WORD_LIST_MANAGER.getVerticalHorizontal(random)== 'V'){ 
//                                String letra = Game.WORD_LIST_MANAGER.getWord(random);
//                                char letra2 = letra.charAt(Game.WORD_LIST_MANAGER.getWord(random).length()-1);
//                                letra = Character.toString(letra2);
//                                txField.setText(null);
//                                txField.setText(letra);
//                                txField.setForeground(Color.red);
//                                Letter letter = new Letter(letra2);
//                               respuestas1.setLetterPosition(Game.WORD_LIST_MANAGER.getWord(random).length()-1,j_, letter);
//                               countHelp[random] =true;
//                           }
//                        }      
//                        
//                    } 
                       
                   
                
               
                
                

                pnCrossword.add(txField);          
            }
        }
           pnCrossword.updateUI();     
    }
    
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
                public void windowClosing(WindowEvent e){
                    confirm();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
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
