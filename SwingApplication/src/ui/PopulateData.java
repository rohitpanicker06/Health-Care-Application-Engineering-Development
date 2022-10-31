/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import doctor.Doctor;
import doctor.DoctorDirectory;
import static doctor.DoctorDirectory.doctorList;
import hospital.Hospital;
import hospital.HospitalDirectory;
import static hospital.HospitalDirectory.hospitalList;
import house.House;
import model.state.city.community.CommunityDirectory;
import patient.Patient;
import patient.PatientDirectory;
import person.Person;
import person.PersonDirectory;
import rbac.application.user.User;
import rbac.application.user.UserListDirectory;
import us.state.city.City;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class PopulateData {
    
    
    
    public static void populateData(){
        
        /*
        
        City = 1;
        Communit =1
        House =1
        Person = 4
        Patient = 2 = done
        Doctor =2  = 4 aya check karo kaise
        Hospital = 2 done
        */
        
         City city = new City("Massacheuttus", "USA", "Boston");
         Community community  = new Community (city, "Huntington", "251","02115");
         CommunityDirectory.communityList.add(community);
         House house = new House(community, 007, 07);
         Person person = new Person("01", "Rohit Panicker", "rohitpanicker06@gmail.com", 97621238, house, "Male", 23);
         PersonDirectory.personList.add(person);
         User user = new User("admin", "admin", person);
         UserListDirectory.getUserList().add(user);
         UserListDirectory.getPatientList().add(user);
         UserListDirectory.getSystemAdminList().add(user);
         UserListDirectory.getDoctorUserList().add(user);
         UserListDirectory.getHospitalAdminList().add(user);
         UserListDirectory.getCommunityAdminList().add(user);
       
         
         Person person_one = new Person("02", "Rahul Panicker", "rohitpanicker06@gmail.com", 97621239, house, "Male", 24);
         PersonDirectory.personList.add(person_one);
         
      
       
      
        PatientDirectory patientDirectory = new PatientDirectory();
        Patient patient = new Patient(person, 0025);
        Patient patient_two = new Patient(person_one,0026);
        patientDirectory.getPatientList().add(patient);
        patientDirectory.getPatientList().add(patient_two);
        
        
         Hospital hospital_one = new Hospital("Harvard Medical Center", community, 881);
        
         HospitalDirectory.hospitalList.add(hospital_one);
         
         Hospital hospital_two = new Hospital("Boston Medical Center", community, 882);
        
         HospitalDirectory.hospitalList.add(hospital_two);
        
        
        Person person_DoctPerson = new Person("55", "Niral Pethe", "nirmal@gmail.com", 9768, house, "Male", 50);
        PersonDirectory.personList.add(person_DoctPerson);
        Doctor doctor = new Doctor(person_DoctPerson,hospital_one);
        DoctorDirectory.doctorList.add(doctor);
         
        Person person_two = new Person("56", "Niral Pethe2", "nirmal2@gmail.com", 97682, house, "Male2", 52);
        PersonDirectory.personList.add(person_two);
        Doctor doctor_two = new Doctor(person_two, hospital_two);
        DoctorDirectory.doctorList.add(doctor_two);
         
        hospital_one.getDoctorList().add(doctor);
        hospital_two.getDoctorList().add(doctor_two);
        
        patient.setHospital(hospital_one);
        patient_two.setHospital(hospital_two);
        
        hospital_one.getPatientList().add(patient);
        hospital_two.getPatientList().add(patient_two);
  
        
        
         
       
         
         

         
        
         
    
    }
}
