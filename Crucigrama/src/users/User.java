/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 * this class is responsible for the management of all users
 * 
 *@version 10/12/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class User implements Serializable{
    private boolean instructions;
    private String ID;
    private String password;
    private Progress progress;
    private int userCode = -1;

    /**
     *Builder
     */
    public User() {
    }

    /**
     *Builder
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
     *get
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     *set
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *get
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *set
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *get
     * @return
     */
    public Progress getProgress() {
        return progress;
    }

    /**
     *set
     * @param progress
     */
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    /**
     * get
     * @return
     */
    public boolean isInstructions() {
        return instructions;
    }

    /**
     * set
     * @param instructions
     */
    public void setInstructions(boolean instructions) {
        this.instructions = instructions;
    }

    /**
     * get
     * @return
     */
    public int getUserCode() {
        return userCode;
    }

    /**
     * set
     * @param userCode
     */
    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    /**
     * this method gives each user a different code
     * @return user code
     */
    public int addUserCode(){
        this.userCode += 1;
        return userCode;
    }
    
    /**
     * this method gives each user a different code
     * @param previuos previous user's code
     * @return user code
     */
    public int addUserCodeMore(int previuos){
        this.userCode = previuos;
        this.userCode += 1;
        return userCode;
    }
     
    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "User{" + "instructions=" + instructions + ", ID=" + ID + ", password=" + password + ", progress=" + progress + ", userCode=" + userCode + '}';
    }
}
