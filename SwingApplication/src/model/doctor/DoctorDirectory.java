/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import house.House;
import java.util.ArrayList;
import person.Person;
import us.state.city.City;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class DoctorDirectory {
    
     private static ArrayList<Doctor> doctorList;
     
     static{
         doctorList =  new ArrayList<>();
         City city = new City("Massacheuttus", "USA", "Boston");
         Community community  = new Community (city, "Huntington", "251","02115");
        
         House house = new House(community, 89, 890);
         Person person = new Person("55", "Niral Pethe", "nirmal@gmail.com", 9768, house, "Male", 50);
         Doctor doctor = new Doctor(person);
         doctorList.add(doctor);
         
         
  
        
        
         Person person_two = new Person("56", "Niral Pethe2", "nirmal2@gmail.com", 97682, house, "Male2", 52);
         Doctor doctor_two = new Doctor(person_two);
         doctorList.add(doctor_two);
         
         
        
     }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
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
