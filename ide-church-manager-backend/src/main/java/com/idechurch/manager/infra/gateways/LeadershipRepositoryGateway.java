package com.idechurch.manager.infra.gateways;

import com.idechurch.manager.infra.persistence.repositories.FamilyRepository;
import com.idechurch.manager.infra.persistence.repositories.LeadershipRepository;

public class LeadershipRepositoryGateway {

    //implementar a interface LeadershipGateway

    private final LeadershipRepository leadershipRepository;

    public LeadershipRepositoryGateway(LeadershipRepository leadershipRepository) {
        this.leadershipRepository = leadershipRepository;
    }
}
