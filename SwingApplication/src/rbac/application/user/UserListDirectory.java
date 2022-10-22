/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.application.user;

import house.House;
import java.util.ArrayList;
import java.util.HashMap;
import person.Person;
import us.state.city.City;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class UserListDirectory {
    
    private static ArrayList<User> userList = new ArrayList<>();
    static{
        
         City city = new City("Massacheuttus", "USA", "Boston");
         Community community  = new Community (city, "Huntington", "251","02115");
         House house = new House(community, 007, 07);
         Person person = new Person("01", "Rohit Panicker", "rohitpanicker06@gmail.com", 97621238, house, "Male", 23);
         User user = new User("admin", "admin", person);
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
