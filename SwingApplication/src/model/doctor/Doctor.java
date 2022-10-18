/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import person.Person;

/**
 *
 * @author rohitpanicker
 */
public class Doctor {
    private Person person;
    
    public Doctor(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public boolean isMatch(Doctor doctorProfile){
        
        return getPerson().getId().equals(doctorProfile.getPerson().getId());
    }
    
    
    
}
