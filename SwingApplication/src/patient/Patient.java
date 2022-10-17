/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import doctor.Doctor;
import person.Person;

/**
 *
 * @author rohitpanicker
 */
public class Patient {

    
    Person person;
    
    public Patient(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public boolean isMatch( Patient patient){
        
        return getPerson().getId().equals(patient.getPerson().getId());
    }
    
    
    
    
}
