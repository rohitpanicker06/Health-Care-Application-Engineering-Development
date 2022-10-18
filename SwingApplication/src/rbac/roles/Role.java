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
    private boolean read = false;
    private boolean write= false;
    private boolean search = false;
    private boolean create = false;

    public RbacApplicationContext getRbacApplicationContext() {
        return rbacApplicationContext;
    }

    public void setRbacApplicationContext(RbacApplicationContext rbacApplicationContext) {
        this.rbacApplicationContext = rbacApplicationContext;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }

    public boolean isCreate() {
        return create;
    }

    public void setCreate(boolean create) {
        this.create = create;
    }

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
