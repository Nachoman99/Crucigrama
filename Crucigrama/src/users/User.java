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

    public User() {
    }

    public User(String ID, String password, Progress progress, boolean instructions) {
        this.ID = ID;
        this.password = password;
        this.progress = progress;
        this.instructions = instructions;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public boolean isInstructions() {
        return instructions;
    }

    public void setInstructions(boolean instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "User{" + "instructions=" + instructions + ", ID=" + ID + ", password=" + password + ", progress=" + progress + '}';
    }
}
