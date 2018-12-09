/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 *
 * @author Nacho
 */
public class UserList implements Serializable{
    private User[] userList;
    private int counter;

    /**
     *
     */
    public UserList() {
        userList = new User[100];
    }

    /**
     *
     * @param userList
     * @param counter
     */
    public UserList(User[] userList, int counter) {
        this.userList = userList;
        this.counter = counter;
    }

    /**
     *
     * @return
     */
    public User[] getUserList() {
        return userList;
    }

    /**
     *
     * @param userList
     */
    public void setUserList(User[] userList) {
        this.userList = userList;
    }
    
    /**
     *
     * @param selected
     * @return
     */
    public int getUserCode(int selected) {
        return userList[selected].getUserCode();
    }

    /**
     *
     * @param selected
     * @param instructios
     */
    public void setInstructios(int selected, boolean instructios){
        userList[selected].setInstructions(instructios);
    }
    
    /**
     *
     * @param seleted
     * @return
     */
    public boolean getInstructions(int seleted){
        return userList[seleted].isInstructions();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public User getUser(int index){
        return userList[index];
    }
    
    /**
     *
     * @return
     */
    public int getCounter() {
        return counter;
    }

    /**
     *
     * @param counter
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "UserList{" + "userList=" + userList + ", counter=" + counter + '}';
    }
    
    /**
     *
     * @param user
     */
    public void addWord(User user) {
        userList[counter++] = user;
    }
    
    /**
     *
     * @param number
     * @return
     */
    public User getEspecificUser(int number){
        return userList[number];
    }
    
    /**
     *
     * @param instructions
     * @param userCode
     */
    public void addInstructions(boolean instructions, int userCode){
        userList[userCode].setInstructions(instructions);
    }
   
    /**
     *
     * @return
     */
    public String getListString() {
        String text = "";
        for (int i = 0; i < counter; i++) {
            text += userList[i] + "\n";
        }
        return text;
    }
    
    /**
     *
     * @param position
     * @return
     */
    public String getPassword(int position){
        String txt = "";
        txt = userList[position].getPassword();
        return txt;
    }
    
    /**
     *
     * @param position
     * @return
     */
    public String getID(int position){
        String ID = "";
        ID = userList[position].getID();
        return ID;
    }
}
