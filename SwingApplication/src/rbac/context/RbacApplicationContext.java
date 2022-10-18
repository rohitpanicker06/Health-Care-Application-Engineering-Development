/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbac.context;

import rbac.roles.Role;

/**
 *
 * @author rohitpanicker
 */
public class RbacApplicationContext {
    
    private Role roleContext ;

    public Role getRoleContext() {
        return roleContext;
    }

    public void setRoleContext(Role role) {
        this.roleContext = role;
    }

   
    
}
