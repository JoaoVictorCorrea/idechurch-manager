package com.idechurch.manager.infra.gateways;

import com.idechurch.manager.infra.persistence.repositories.MinistryRepository;

public class MinistryRepositoryGateway {

    //implementar a interface MinistryGateway

    private final MinistryRepository ministryRepository;

    public MinistryRepositoryGateway(MinistryRepository ministryRepository) {
        this.ministryRepository = ministryRepository;
    }
}
