/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import person.Person;
import us.state.city.City;

/**
 *
 * @author rohitpanicker
 */
public class HospitalDirectory {
     private ArrayList<Hospital> hospitalList ;
     private City city;
    
    public HospitalDirectory (){
          
       hospitalList = new ArrayList();

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
