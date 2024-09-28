package com.idechurch.manager.infra.persistence.repositories;

import com.idechurch.manager.infra.persistence.jpa.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
