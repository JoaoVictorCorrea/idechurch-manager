package com.idechurch.manager.domain;

import com.idechurch.manager.domain.enums.Requirement;

import java.util.List;

public record Family(
        long id,
        List<Requirement> requirements,
        List<Member> members
) {}
