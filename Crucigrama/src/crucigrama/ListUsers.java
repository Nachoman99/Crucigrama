/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

/**
 *
 * @author Kevin Trejos
 */
public class ListUsers {
    private User[] list;
    private int usersCount;

    public ListUsers() {
        list = new User[20];
    }
    
    public ListUsers(User[] list) {
        this.list = list;
        usersCount = this.list.length;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    
    public User[] getList() {
        return list;
    }

    public void setList(User[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListUsers{" + "list=" + list + ", usersCount=" + usersCount + '}';
    }
    
    public int addUSer(User user){
        if (user != null) {          
            for (int i = 0; i < list.length; i++) {
                if (list[i] != null) {
                    duplicate();
                }
                if (list[i] == null && verify(user.getID()) == 0) {
                    list[i] = user;
                    return 0;
                }
            }
        }
        return -1;
    }
    
    private void duplicate(){
        User[] list2 = new User[list.length * 2];
        for (int i = 0; i < list.length; i++) {
            list2[i] = list[i];
        }
        list = list2;
    }
    
    private int verify(String userID){
        for (int i = 0; i < list.length; i++) {
            if (list[i].getID() == userID) {
                return 1;
            }
        }
        return 0;
    }
}
