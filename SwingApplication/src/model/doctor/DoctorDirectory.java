/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import java.util.ArrayList;
import person.Person;

/**
 *
 * @author rohitpanicker
 */
public class DoctorDirectory {
    
     private ArrayList<Doctor> doctorList ;
    
      public DoctorDirectory (){
          
       doctorList = new ArrayList();

    }

    public Doctor newDoctor(Person person) {

        Doctor doctor = new Doctor(person);
        doctorList.add(doctor);
        return doctor;
    }

    public Doctor findDoctor(Doctor doctorProfile) {

        for (Doctor doctor : doctorList) {

            if (doctor.isMatch(doctorProfile)) {
                return doctor;
            }
        }
            return null; 
         }
    
}
