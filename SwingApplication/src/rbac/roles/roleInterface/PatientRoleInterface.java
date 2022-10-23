/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rbac.roles.roleInterface;

/**
 *
 * @author rohitpanicker
 */
public interface PatientRoleInterface {
    
     boolean createUser = false;
    boolean createDoctor = false;
    boolean createHospital = false;
    boolean createVitalSigns = false;
    boolean createEncounter = false;
    boolean createPatient= false;
    boolean createCommunity = false;
    boolean createCity = false;
    boolean createHouse = false;
    
    boolean deleteUser = false;
    boolean deleteDoctor = false;
    boolean deleteHospital = false;
    boolean deleteVitalSigns = false;
    boolean deleteEncounter = false;
    boolean deletePatient= false;
    boolean deleteCommunity = false;
    boolean deleteCity = false;
    boolean deleteHouse = false;
    
    boolean readUser = false;
    boolean readDoctor = true;
    boolean readHospital = true;
    boolean readVitalSigns = true;
    boolean readEncounter = true;
    boolean readPatient= false;
    boolean readCommunity = false;
    boolean readCity = false;
    boolean readHouse = false;
    
    boolean updateUser = false;
    boolean updateDoctor = false;
    boolean updateHospital = false;
    boolean updateVitalSigns = false;
    boolean updateEncounter = false;
    boolean updatePatient= false;
    boolean updateCommunity = false;
    boolean updateCity = false;
    boolean updateHouse = false;
    
}
