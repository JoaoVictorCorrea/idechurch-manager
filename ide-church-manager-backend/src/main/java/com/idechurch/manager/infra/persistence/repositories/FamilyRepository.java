package com.idechurch.manager.infra.persistence.repositories;

import com.idechurch.manager.infra.persistence.jpa.entities.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<Family, Long> {
}
