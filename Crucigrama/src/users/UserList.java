/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 * this class manages the list of users who have registered
 * 
 *@version 10/12/2018
 * @author Jose Ignacio Zamora/Kevin Trejos/Edwin Molina
 */
public class UserList implements Serializable{
    private User[] userList;
    private int counter;

    /**
     *Builder
     */
    public UserList() {
        userList = new User[1000];
    }

    /**
     * Builder
     * @param userList
     * @param counter
     */
    public UserList(User[] userList, int counter) {
        this.userList = userList;
        this.counter = counter;
    }

    /**
     * get
     * @return
     */
    public User[] getUserList() {
        return userList;
    }

    /**
     * set
     * @param userList
     */
    public void setUserList(User[] userList) {
        this.userList = userList;
    }
    
    /**
     * get
     * @param selected
     * @return
     */
    public int getUserCode(int selected) {
        return userList[selected].getUserCode();
    }

    /**
     * set
     * @param selected
     * @param instructios
     */
    public void setInstructios(int selected, boolean instructios){
        userList[selected].setInstructions(instructios);
    }
    
    
    
    /**
     * get
     * @param seleted
     * @return
     */
    public boolean getInstructions(int seleted){
        return userList[seleted].isInstructions();
    }
    
    /**
     * get
     * @param index
     * @return
     */
    public User getUser(int index){
        return userList[index];
    }
    
    /**
     * get
     * @return
     */
    public int getCounter() {
        return counter;
    }

    /**
     * set
     * @param counter
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    /**
     *toString
     * @return
     */
    @Override
    public String toString() {
        return "UserList{" + "userList=" + userList + ", counter=" + counter + '}';
    }
    
    /**
     * add a new user to the list
     * @param user
     */
    public void addUser(User user) {
        userList[counter++] = user;
    }
    
    /**
     * returns a specific user from the list
     * @param number User's position in the list
     * @return a specific user from the list
     */
    public User getEspecificUser(int number){
        return userList[number];
    }
    
    /**
     * says if the user touched the button to not show the instructions again
     * @param instructions whether he touched it or not
     * @param userCode user code
     */
    public void addInstructions(boolean instructions, int userCode){
        userList[userCode].setInstructions(instructions);
    }
   
    /**
     * convert the list of users in String
     * @return the list of users in String
     */
    public String getListString() {
        String text = "";
        for (int i = 0; i < counter; i++) {
            text += userList[i] + "\n";
        }
        return text;
    }
    
    /**
     *returns the password of a specific user
     * @param position position of the user in the list
     * @return the password of a specific user
     */
    public String getPassword(int position){
        String txt = "";
        txt = userList[position].getPassword();
        return txt;
    }
    
    /**
     * returns the identification of a specific user
     * @param position position of the user in the list
     * @return the identification of a specific user
     */
    public String getID(int position){
        String ID = "";
        ID = userList[position].getID();
        return ID;
    }
}
