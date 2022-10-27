/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import doctor.Doctor;
import doctor.DoctorDirectory;
import house.House;
import java.util.ArrayList;
import person.Person;
import rbac.application.user.User;
import us.state.city.City;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class HospitalDirectory {
     public static ArrayList<Hospital> hospitalList = hospitalList = new ArrayList();
     
     static{
          City city = new City("Massacheuttus", "USA", "Boston");
         Community community  = new Community (city, "Huntington", "251","02115");
        
         House house = new House(community, 89, 890);
         Person person = new Person("65", "Niral Pethe", "nirmal@gmail.com", 9768, house, "Male", 50);
         
        
       
         
         Hospital hospital_one = new Hospital("Harvard Medical Center", community, 881);
         hospital_one.getDoctorDirectory().newDoctor(person);
         
         hospitalList.add(hospital_one);
         Hospital hospital_two = new Hospital("Boston Medical Center", community, 882);
         Person person_two = new Person("66", "Niral Pethe 2", "nirmal2@gmail.com", 97682, house, "Femaile", 51);
         hospital_two.getDoctorDirectory().newDoctor(person_two);
         hospitalList.add(hospital_two);
         
         
         
        
         
         
         
         
     }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public static void setHospitalList(ArrayList<Hospital> hospitalList) {
        HospitalDirectory.hospitalList = hospitalList;
    }
    
   

    public Hospital newHospital(String name) {

         Hospital hospital = new Hospital(name);
        hospitalList.add(hospital);
        return hospital;
    }

    public Hospital findHospitalByName(String name) {

        for (Hospital hospital : hospitalList) {

            if (hospital.isMatchByName(name)) {
                return hospital;
            }
        }
            return null; 
         }
}
