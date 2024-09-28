package com.idechurch.manager.domain;

import java.util.List;

public record Ministry(
        int id,
        String name,
        List<Member> members,
        Leadership leadership
) {}
