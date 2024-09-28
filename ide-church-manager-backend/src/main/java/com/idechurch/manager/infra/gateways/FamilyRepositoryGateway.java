package com.idechurch.manager.infra.gateways;

import com.idechurch.manager.infra.persistence.repositories.FamilyRepository;

public class FamilyRepositoryGateway {

    //implementar a interface FamilyGateway

    private final FamilyRepository familyRepository;

    public FamilyRepositoryGateway(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }
}
