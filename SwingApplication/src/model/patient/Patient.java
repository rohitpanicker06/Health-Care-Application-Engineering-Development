/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;


import encounter.EncounterHistory;
import person.Person;

/**
 *
 * @author rohitpanicker
 */
public class Patient {

    
    private Person person;
    private EncounterHistory encounterHistory;
    private int insuranceId;
    
    
    public Patient(Person person) {
        this.person = person;
        this.encounterHistory = new EncounterHistory();
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
