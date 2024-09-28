package com.idechurch.manager.domain;

import com.idechurch.manager.domain.enums.MaritalStatus;

import java.util.Date;
import java.util.List;

public record Member(
        long id,
        String name,
        Date dateOfBirth,
        String phone,
        String email,
        String address,
        boolean thirtyWeeks,
        MaritalStatus maritalStatus,
        Family family,
        List<Ministry> ministries
) {}
