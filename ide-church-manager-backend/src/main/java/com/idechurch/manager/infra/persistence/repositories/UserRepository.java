package com.idechurch.manager.infra.persistence.repositories;

import com.idechurch.manager.infra.persistence.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
