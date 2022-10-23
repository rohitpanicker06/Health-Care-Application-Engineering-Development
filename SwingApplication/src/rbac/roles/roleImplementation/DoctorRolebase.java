/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.roles.roleImplementation;

import rbac.role.Role;
import rbac.roles.roleInterface.DoctorRoleInterface;
import rbac.roles.roleInterface.SystemAdminRoleInterface;

/**
 *
 * @author rohitpanicker
 */
public class DoctorRoleBase extends Role implements DoctorRoleInterface{

    public static boolean isCreateUser() {
        return createUser;
    }

    public static boolean isCreateDoctor() {
        return createDoctor;
    }

    public static boolean isCreateHospital() {
        return createHospital;
    }

    public static boolean isCreateVitalSigns() {
        return createVitalSigns;
    }

    public static boolean isCreateEncounter() {
        return createEncounter;
    }

    public static boolean isCreatePatient() {
        return createPatient;
    }

    public static boolean isCreateCommunity() {
        return createCommunity;
    }

    public static boolean isCreateCity() {
        return createCity;
    }

    public static boolean isCreateHouse() {
        return createHouse;
    }

    public static boolean isDeleteUser() {
        return deleteUser;
    }

    public static boolean isDeleteDoctor() {
        return deleteDoctor;
    }

    public static boolean isDeleteHospital() {
        return deleteHospital;
    }

    public static boolean isDeleteVitalSigns() {
        return deleteVitalSigns;
    }

    public static boolean isDeleteEncounter() {
        return deleteEncounter;
    }

    public static boolean isDeletePatient() {
        return deletePatient;
    }

    public static boolean isDeleteCommunity() {
        return deleteCommunity;
    }

    public static boolean isDeleteCity() {
        return deleteCity;
    }

    public static boolean isDeleteHouse() {
        return deleteHouse;
    }

    public static boolean isReadUser() {
        return readUser;
    }

    public static boolean isReadDoctor() {
        return readDoctor;
    }

    public static boolean isReadHospital() {
        return readHospital;
    }

    public static boolean isReadVitalSigns() {
        return readVitalSigns;
    }

    public static boolean isReadEncounter() {
        return readEncounter;
    }

    public static boolean isReadPatient() {
        return readPatient;
    }

    public static boolean isReadCommunity() {
        return readCommunity;
    }

    public static boolean isReadCity() {
        return readCity;
    }

    public static boolean isReadHouse() {
        return readHouse;
    }

    public static boolean isUpdateUser() {
        return updateUser;
    }

    public static boolean isUpdateDoctor() {
        return updateDoctor;
    }

    public static boolean isUpdateHospital() {
        return updateHospital;
    }

    public static boolean isUpdateVitalSigns() {
        return updateVitalSigns;
    }

    public static boolean isUpdateEncounter() {
        return updateEncounter;
    }

    public static boolean isUpdatePatient() {
        return updatePatient;
    }

    public static boolean isUpdateCommunity() {
        return updateCommunity;
    }

    public static boolean isUpdateCity() {
        return updateCity;
    }

    public static boolean isUpdateHouse() {
        return updateHouse;
    }
    
    
   

    
}
