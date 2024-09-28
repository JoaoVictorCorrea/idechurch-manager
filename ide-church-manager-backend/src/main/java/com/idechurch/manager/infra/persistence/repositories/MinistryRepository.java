package com.idechurch.manager.infra.persistence.repositories;

import com.idechurch.manager.infra.persistence.jpa.entities.Ministry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MinistryRepository extends JpaRepository<Ministry, Integer> {
}
