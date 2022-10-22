/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.application.user;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author rohitpanicker
 */
public class UserListDirectory {
    
    private static ArrayList<User> userList = new ArrayList<>();
    static{
        User user = new User("admin", "admin");
        userList.add(user);
    }
    
    public User getUser(String userName)
    {
        for(User user: userList)
        {
            if(user.getUserName().equals(userName)){
                return  user;
            }
        }
        return null;
    }
    public boolean checkUserValidation(String name, String password){
        User user = getUser(name);
       if(user != null)
       {
           if(user.getPassword().equals(password)){
               return true;
           }else{
               return false;
           }
       }else{
           return false;
       }
    }
    
    public void addNewUser(String name, String password)
    {
        User user = new User(name, password);
        userList.add(user);
         
    }
  
    
    
}
