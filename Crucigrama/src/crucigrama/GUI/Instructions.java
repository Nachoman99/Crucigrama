/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama.GUI;

import crucigrama.Crossword;
import filemanager.WriterManagerBinary;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import users.User;
/**
 *In this window you will see the instructions to play
 * 
 * @version 30/11/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class Instructions extends javax.swing.JDialog {
   
    /**
    * Creates new form Instructions
    */
    public Instructions(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
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

        jLabel1 = new javax.swing.JLabel();
        cbNotShow = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnContinue = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INSTRUCCIONES");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel1.setText("Por favor lea las siguientes instrucciones:");

        cbNotShow.setText("No volver a mostrar");
        cbNotShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbNotShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNotShowActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lea cada una de las definiciones que aparecerán \na continuación, luego encuentre en el crucigrama\nel número que corresponde a cada una de ellas,\nademás se le indicara si la palabra se encuentra\nde forma horizontal o vertical, luego complete \nlos espacios vacios con letras que correspondan \na la palabra de la definición. Cuando rellene \ntodos los espacios en blanco deberá precionar la\nopción de verificar gane, en caso de que alguna\npalabra este incorrecta se resaltará la primera\nletra de la palabra que este incorrecta, eso en \nel nivel fácil, en el nivel intermedio y en el \ndifíci solo se mostrará el número de palabras \nincorrectas.\n\nAdemás dependiendo del nivel de dificultad dis-\npondrá de la opción de ayuda; para el nivel \nfácil al precionar la opción de ayuda se comple-\ntará la primera letra de una palabra aleatoria,\nsi esta ya ha sido completada se completará la\núltima letra, así hasta que se hayan completado\nla primera y la última letra de cada palabra, \nluego la opción no podrá ser utilizada más, en\nel nivel medio, al presionar el boton de ayuda\nse completará una letra de una palabra al azar,\ncuando se hayan completado una letra de todas\nlas palabras la opción de ayuda ya no podra ser\nutilizada más.\n\n");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        btnContinue.setText("Continuar");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        btnBack.setText("Atrás");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinue)
                .addGap(18, 18, 18)
                .addComponent(cbNotShow)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNotShow)
                    .addComponent(btnContinue)
                    .addComponent(btnBack))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * It does not show the instruction window
     * @param evt the event that makes the button
     */
    private void cbNotShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNotShowActionPerformed
        WriterManagerBinary writer = new WriterManagerBinary();
        //No volver a mostrar la ventana
        
        //Mostrar la ventana
    }//GEN-LAST:event_cbNotShowActionPerformed

    /**
     * Show the next window
     * @param evt the event that makes the button
     */
    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        Level level = new Level(this, true);
        this.dispose();
        level.setVisible(true);
    }//GEN-LAST:event_btnContinueActionPerformed

    /**
     * Close the current window and show the previous one
     * @param evt the event that makes the button
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Welcome welcome = new Welcome();
        Login enter = new Login(welcome, true);
        this.dispose();
        enter.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * Pressing the X returns to the main window
     */
    private void closeX(){
        try {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
     * Show the main window and close the current window
     */
    private void confirm(){
        Welcome welcome = new Welcome();
        this.dispose();
        welcome.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnContinue;
    private javax.swing.JCheckBox cbNotShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
