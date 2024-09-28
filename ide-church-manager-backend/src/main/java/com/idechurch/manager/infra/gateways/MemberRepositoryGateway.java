package com.idechurch.manager.infra.gateways;

import com.idechurch.manager.infra.persistence.repositories.MemberRepository;

public class MemberRepositoryGateway {

    //implementar a interface MemberGateway

    private final MemberRepository memberRepository;

    public MemberRepositoryGateway(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
