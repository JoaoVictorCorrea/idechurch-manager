package com.idechurch.manager.infra.persistence.repositories;

import com.idechurch.manager.infra.persistence.jpa.entities.Leadership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadershipRepository extends JpaRepository<Leadership, Integer> {
}
