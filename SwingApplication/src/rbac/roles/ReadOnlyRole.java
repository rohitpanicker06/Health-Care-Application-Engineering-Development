/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.roles;

/**
 *
 * @author rohitpanicker
 */
public class ReadOnlyRole extends Role{

    public ReadOnlyRole() {
        super(true, false, false, false);
    }
    
    
    
}