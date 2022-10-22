/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import doctor.DoctorDirectory;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class Hospital {

private String hospitalName;
private Community community;
private int hospitalId;
private DoctorDirectory doctorDirectory = new DoctorDirectory();

    public Hospital(String hospitalName, Community community, int hospitalId) {
        this.hospitalName = hospitalName;
        this.community = community;
        this.hospitalId = hospitalId;
        
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

   
    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    public boolean isMatchByName(String name)
    {
        if(getHospitalName().equals(name))
        {
            return true;
        }else{
            return false;
        }
    }

     @Override
    public String toString() {
        return String.valueOf(getHospitalId());
    }
    
}
