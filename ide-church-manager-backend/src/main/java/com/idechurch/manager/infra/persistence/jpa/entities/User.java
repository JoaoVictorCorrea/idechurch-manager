package com.idechurch.manager.infra.persistence.jpa.entities;

import com.idechurch.manager.domain.enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_USER")
@PrimaryKeyJoinColumn(name = "PERSON_ID")
public class User extends Person {
    
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
