package com.idechurch.manager.infra.persistence.jpa.entities;

import java.util.List;

import com.idechurch.manager.domain.enums.MaritalStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_MEMBER")
@PrimaryKeyJoinColumn(name = "PERSON_ID")
public class Member extends Person {
    
    private String address;
    private boolean thirtyWeeks;

    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @ManyToOne
    @JoinColumn(name="family_id")
    private Family family;

    @ManyToMany
    @JoinTable(
            name = "TBL_MEMBER_MINISTRY",
            joinColumns = @JoinColumn(name = "member_id"),
            inverseJoinColumns = @JoinColumn(name = "ministry_id")
    )
    private List<Ministry> ministries;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isThirtyWeeks() {
        return thirtyWeeks;
    }

    public void setThirtyWeeks(boolean thirtyWeeks) {
        this.thirtyWeeks = thirtyWeeks;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public List<Ministry> getMinistries() {
        return ministries;
    }

    public void setMinistries(List<Ministry> ministries) {
        this.ministries = ministries;
    }
}
