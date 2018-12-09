/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 *
 * @author Kevin Trejos
 */
public class User implements Serializable{
    private boolean instructions;
    private String ID;
    private String password;
    private Progress progress;
    private int userCode = -1;

    /**
     *
     */
    public User() {
    }

    /**
     *
     * @param ID
     * @param password
     * @param progress
     * @param instructions
     * @param userCode
     */
    public User(String ID, String password, Progress progress, boolean instructions, int userCode) {
        this.ID = ID;
        this.password = password;
        this.progress = progress;
        this.instructions = instructions;
        this.userCode = userCode;
    }

    /**
     *
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public Progress getProgress() {
        return progress;
    }

    /**
     *
     * @param progress
     */
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    /**
     *
     * @return
     */
    public boolean isInstructions() {
        return instructions;
    }

    /**
     *
     * @param instructions
     */
    public void setInstructions(boolean instructions) {
        this.instructions = instructions;
    }

    /**
     *
     * @return
     */
    public int getUserCode() {
        return userCode;
    }

    /**
     *
     * @param userCode
     */
    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    /**
     *
     * @return
     */
    public int addUserCode(){
        this.userCode += 1;
        return userCode;
    }
    
    /**
     *
     * @param previuos
     * @return
     */
    public int addUserCodeMore(int previuos){
        this.userCode = previuos;
        this.userCode += 1;
        return userCode;
    }
     
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" + "instructions=" + instructions + ", ID=" + ID + ", password=" + password + ", progress=" + progress + ", userCode=" + userCode + '}';
    }

}
