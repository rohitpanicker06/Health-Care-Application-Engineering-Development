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
public class Role {
    RbacApplicationContext rbacApplicationContext = new RbacApplicationContext();
    boolean read = false;
    boolean write= false;
    boolean search = false;
    boolean create = false;

    public Role(boolean read, boolean write, boolean search, boolean create) {
        this.read = read;
        this.write = write;
        this.search = search;
        this.create = create;
    }
    
    public void setApplicationContext(Role role)
    {
        rbacApplicationContext.setRoleContext(role);
    }
    
}
