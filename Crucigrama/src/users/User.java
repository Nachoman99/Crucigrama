/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author Kevin Trejos
 */
public class User {
    private String ID;
    private String password;
    private Progress progress;

    public User() {
        this("","");
    }

    public User(String ID, String password) {
        this.ID = ID;
        this.password = password;
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

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", password=" + password + '}';
    }
    
    public String toFileString(){
        return ID + "-" + password + "-" + progress.toFileString();
    }
    
}
