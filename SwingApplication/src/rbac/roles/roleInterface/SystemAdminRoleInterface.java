/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rbac.roles.roleInterface;

/**
 *
 * @author rohitpanicker
 */
public interface SystemAdminRoleInterface {
    boolean createUser = true;
    boolean createDoctor = true;
    boolean createHospital = true;
    boolean createVitalSigns = true;
    boolean createEncounter = true;
    boolean createPatient= true;
    boolean createCommunity = true;
    boolean createCity = true;
    boolean createHouse = true;
    
    boolean deleteUser = true;
    boolean deleteDoctor = true;
    boolean deleteHospital = true;
    boolean deleteVitalSigns = true;
    boolean deleteEncounter = true;
    boolean deletePatient= true;
    boolean deleteCommunity = true;
    boolean deleteCity = true;
    boolean deleteHouse = true;
    
    boolean readUser = true;
    boolean readDoctor = true;
    boolean readHospital = true;
    boolean readVitalSigns = true;
    boolean readEncounter = true;
    boolean readPatient= true;
    boolean readCommunity = true;
    boolean readCity = true;
    boolean readHouse = true;
    
    boolean updateUser = true;
    boolean updateDoctor = true;
    boolean updateHospital = true;
    boolean updateVitalSigns = true;
    boolean updateEncounter = true;
    boolean updatePatient= true;
    boolean updateCommunity = true;
    boolean updateCity = true;
    boolean updateHouse = true;
}
