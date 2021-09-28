package com.exam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long roleId;
    private  String roleName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "role")
    @JsonIgnore
    private Set<userRole> userRoles =new HashSet<>();

    public Set<userRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<userRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Role() {

    }

    public long getRoleId() {
        return roleId;
    }


    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role(long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }
}
