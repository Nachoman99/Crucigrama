/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author Nacho
 */
public class UserList {
    private User[] userList;
    private int counter;

    public UserList() {
        userList = new User[100];
    }

    public UserList(User[] userList, int counter) {
        this.userList = userList;
        this.counter = counter;
    }

    public User[] getUserList() {
        return userList;
    }

    public void setUserList(User[] userList) {
        this.userList = userList;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    @Override
    public String toString() {
        return "UserList{" + "userList=" + userList + ", counter=" + counter + '}';
    }
    
    public void addStudent(User user) {
        userList[counter++] = user;
    }

    public String getListString() {
        String text = "";
        for (int i = 0; i < counter; i++) {
            text += userList[i] + "\n";
        }
        return text;
    }
}
