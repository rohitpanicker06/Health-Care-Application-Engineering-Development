/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rbac.roles.roleInterface;

/**
 *
 * @author rohitpanicker
 */
public interface CommunityRoleInterface {
    
    
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
    
     boolean readUser = true;
    boolean readDoctor = true;
    boolean readHospital = true;
    boolean readVitalSigns = false;
    boolean readEncounter = false;
    boolean readPatient= true;
    boolean readCommunity = true;
    boolean readCity = true;
    boolean readHouse = true;
    
     boolean updateUser = true;
    boolean updateDoctor = true;
    boolean updateHospital = true;
    boolean updateVitalSigns = false;
    boolean updateEncounter = false;
    boolean updatePatient= true;
    boolean updateCommunity = true;
    boolean updateCity = true;
    boolean updateHouse = true;
}
