package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepo;

    public Flux<Member> getAllMembers() {
        return memberRepo.findAll();
    }

    public Mono<Member> addMember(Member member) {
        return memberRepo.save(member);
    }
}
