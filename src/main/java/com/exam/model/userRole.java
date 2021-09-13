package com.exam.model;

import javax.persistence.*;

@Entity
public class userRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long userRoleId;


    @ManyToOne(fetch = FetchType.EAGER)
    private  User user;

    @ManyToOne
    private  Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
