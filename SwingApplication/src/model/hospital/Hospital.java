/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class Hospital {

private String hospitalName;
private Community community;

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

    
    
}
