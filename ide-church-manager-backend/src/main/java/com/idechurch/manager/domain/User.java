package com.idechurch.manager.domain;

import com.idechurch.manager.domain.enums.Role;

import java.util.Date;

public record User(
        long id,
        String name,
        Date dateOfBirth,
        String phone,
        String email,
        String password,
        Role role
) {}
