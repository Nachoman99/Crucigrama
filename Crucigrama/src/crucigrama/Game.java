/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

import java.util.Arrays;
import crucigrama.GUI.Welcome;
import users.UserList;
/**
 *This is the main
 * 
 * @version 29/11/2018
 * @author Jose Ignacio Zamora/Edwin Molina/Kevin Trejos
 */
public class Game {

    /**
     * A list of registered users
     */
    public static UserList USER_LIST_MANAGER = new UserList();

    /**
     * A list of words
     */
    public static WordList WORD_LIST_MANAGER = new WordList();
    
    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Welcome welcome = new Welcome();
        welcome.setVisible(true);
    }
    
}
