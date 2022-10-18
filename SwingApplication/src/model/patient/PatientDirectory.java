/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;


import java.util.ArrayList;
import person.Person;

/**
 *
 * @author rohitpanicker
 */
public class PatientDirectory {
     private ArrayList<Patient> patientList ;
    
      public PatientDirectory (){
          
       patientList = new ArrayList();

    }

    public Patient newPatient(Person newPatient) {

        Patient patient = new Patient(newPatient);
        patientList.add(patient);
        return patient;
    }

    public Patient findPatient(Patient patient) {

        for (Patient patientProfile : patientList) {

            if (patientProfile.isMatch(patient)) {
                return patientProfile;
            }
        }
            return null; 
         }
}
