package com.idechurch.manager.domain;

import java.util.List;

public record Leadership(
        int id,
        String name,
        Ministry ministry,
        List<Member> members
) {}
