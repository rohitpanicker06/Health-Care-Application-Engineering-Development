/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.application.user;

import person.Person;

/**
 *
 * @author rohitpanicker
 */
public class User {
    
    private String userName;
    private String password;
    private Person person;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String password, Person person) {
        this.userName = userName;
        this.password = password;
        this.person = person;
    }
    
    
    @Override
    public String toString()
    {
        return this.person.getId();
    }
}
