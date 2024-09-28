package com.idechurch.manager.infra.gateways;

import com.idechurch.manager.infra.persistence.repositories.UserRepository;

public class UserRepositoryGateway {

    //implementar a interface UserGateway

    private final UserRepository userRepository;

    public UserRepositoryGateway(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
