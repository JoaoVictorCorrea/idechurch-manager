package com.idechurch.manager.domain;

import java.util.Date;

public record Person(
        long id,
        String name,
        Date dateOfBirth,
        String phone,
        String email
) {}
