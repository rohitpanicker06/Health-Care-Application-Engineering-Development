/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.roles;

import rbac.context.RbacApplicationContext;

/**
 *
 * @author rohitpanicker
 */
public class AdminRole extends Role{

    public AdminRole() {
        
        super(true, true, true, true);
    }
    
    
    
}
