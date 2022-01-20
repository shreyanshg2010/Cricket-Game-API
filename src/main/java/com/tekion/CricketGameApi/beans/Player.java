package com.tekion.CricketGameApi.beans;

import com.tekion.CricketGameApi.util.Role;

public class Player {
    private String name;
    private Role role;
    private String DOB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player() {
    }

    public Player(String name, Role role, String DOB) {
        this.name = name;
        this.role = role;
        this.DOB = DOB;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
