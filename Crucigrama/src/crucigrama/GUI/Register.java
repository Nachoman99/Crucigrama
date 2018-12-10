/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama.GUI;

import crucigrama.Game;
import users.User;
import filemanager.ReaderManagerBinary;
import filemanager.WriterManagerBinary;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *This is the window where the user registers
 * 
 * @version 30/11/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class Register extends javax.swing.JDialog {
    User user = new User();
    boolean result;
    
    /**
     * Creates new form Register
     * @param parent
     * @param modal
     */
    public Register(java.awt.Frame parent, boolean modal) {
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
        tfID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btnCheckIn = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRARSE");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel1.setText("Por favor ingrese los datos solicitados");

        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Por favor ingrese una identificación:");

        jLabel3.setText("Por favor ingrese una contraseña:");

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });

        btnCheckIn.setText("Registrarse");
        btnCheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfID, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(pfPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(btnCheckIn)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckIn)
                    .addComponent(btnBack))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed

        String iD = tfID.getText();         
    }//GEN-LAST:event_tfIDActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
      
    }//GEN-LAST:event_pfPasswordActionPerformed

    /**
     * This method verifies if all the entered data are correct and 
     * enters the user into the system
     * @param evt the event that makes the button
     */
    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        Instructions instructions = new Instructions(this, true);
        ReaderManagerBinary reader = new ReaderManagerBinary();
        WriterManagerBinary writer = new WriterManagerBinary();
        if (tfID.getText().length() < 4) {
            JOptionPane.showMessageDialog(this, "Por favor digite una identificación de al menos 4 caracteres");
            instructions.setVisible(false);
        }else if(pfPassword.getPassword().length < 3){
            JOptionPane.showMessageDialog(this, "Por favor digite una contraseña de al menos 3 caracteres");
            instructions.setVisible(false);
        }else{
            try {
                reader.open("Users/userFile.ser");
                Game.USER_LIST_MANAGER = reader.read();
                reader.close(); //importante cerrar el archivo
                System.out.println("Lectura exitosa");
                System.out.println("Contenido de la lista:\n" + Game.USER_LIST_MANAGER.getListString());
            } catch (IOException ex) {
                System.err.println("error de archivo");
                System.err.println(ex.getMessage());
            } catch (ClassNotFoundException ex) {
                System.err.println("error de archivo");
                System.err.println(ex.getMessage());   
            }
            int repeated = 0;
            for (int i = 0; i < Game.USER_LIST_MANAGER.getCounter(); i++) {
            if (tfID.getText().equals(Game.USER_LIST_MANAGER.getID(i))) {
                repeated += 1;
                System.err.println("Termina");
            }else{
                repeated += 0;
                System.out.println("Continuar");
            }
        }
        if (repeated<=0) {
            user.setID(tfID.getText());
            char[] passwoord = pfPassword.getPassword(); 
            String pass = new String(passwoord);
            user.setPassword(pass);
            if(Game.USER_LIST_MANAGER.getCounter() >= 1){
               int previous = Game.USER_LIST_MANAGER.getEspecificUser(Game.USER_LIST_MANAGER.getCounter()-1).getUserCode();
               user.addUserCodeMore(previous);
            }else{ 
               user.addUserCode(); 
            }
            Game.USER_LIST_MANAGER.addUser(user);
            try {
                writer.open("Users/userFile.ser");  //probar el parametro apend en new FileWriter(fileName, true)
                writer.write();
                writer.close(); //importante cerrar el archivo 
                System.out.println("Escritura exitosa");
            } catch (IOException ex) {
                System.err.println("error de archivo");
                System.err.println(ex.getMessage());
            }
            instructions.userSelected(Game.USER_LIST_MANAGER.getUserCode(Game.USER_LIST_MANAGER.getCounter()-1));
            result = Game.USER_LIST_MANAGER.getInstructions(Game.USER_LIST_MANAGER.getCounter()-1);
            if (result == true) {
                Level level = new Level(this, true);
                instructions.setVisible(false);
                this.dispose();
                level.setVisible(true);
            }else{
                this.dispose();
                instructions.setVisible(true);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Su identificación ya ha sido usada, por favor digite otra");
        } 
        }     
    }//GEN-LAST:event_btnCheckInActionPerformed

    /**
     * Return to the previous window
     * @param evt the event that makes the button
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        Welcome welcome = new Welcome();
        this.dispose();
        welcome.setVisible(true);
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
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
}
