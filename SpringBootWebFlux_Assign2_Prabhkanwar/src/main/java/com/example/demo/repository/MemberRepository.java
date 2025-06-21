package com.example.demo.repository;

import com.example.demo.model.Member;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MemberRepository extends ReactiveMongoRepository<Member, String> {
}
