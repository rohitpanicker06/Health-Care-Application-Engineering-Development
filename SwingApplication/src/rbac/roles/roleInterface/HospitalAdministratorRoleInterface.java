/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rbac.roles.roleInterface;

/**
 *
 * @author rohitpanicker
 */
public interface HospitalAdministratorRoleInterface {
     boolean createUser = true;
    boolean createDoctor = true;
    boolean createHospital = true;
    boolean createVitalSigns = false;
    boolean createEncounter = false;
    boolean createPatient= true;
    boolean createCommunity = false;
    boolean createCity = false;
    boolean createHouse = false;
    
    boolean deleteUser = true;
    boolean deleteDoctor = true;
    boolean deleteHospital = false;
    boolean deleteVitalSigns = true;
    boolean deleteEncounter = true;
    boolean deletePatient= true;
    boolean deleteCommunity = false;
    boolean deleteCity = false;
    boolean deleteHouse = false;
    
    boolean readUser = true;
    boolean readDoctor = true;
    boolean readHospital = true;
    boolean readVitalSigns = true;
    boolean readEncounter = true;
    boolean readPatient= true;
    boolean readCommunity = false;
    boolean readCity = false;
    boolean readHouse = false;
    
    boolean updateUser = true;
    boolean updateDoctor = true;
    boolean updateHospital = true;
    boolean updateVitalSigns = true;
    boolean updateEncounter = true;
    boolean updatePatient= true;
    boolean updateCommunity = false;
    boolean updateCity = false;
    boolean updateHouse = false;
}
