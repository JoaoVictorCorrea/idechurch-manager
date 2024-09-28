package com.idechurch.manager.domain.enums;

public enum Requirement {

    BASIC_FOOD_BASKET("Cesta Básica"),
    PSYCHOLOGICAL_COUNSELING("Aconselhamento Psicológico"), 
    PASTORAL_COUNSELING("Aconselhamento Pastoral");

    public final String description;

    private Requirement(String description) {
        this.description = description;
    }
}
