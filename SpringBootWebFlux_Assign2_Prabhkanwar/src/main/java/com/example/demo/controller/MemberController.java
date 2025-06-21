package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public Flux<Member> getAll() {
        return memberService.getAllMembers();
    }

    @PostMapping
    public Mono<Member> add(@RequestBody Member member) {
        return memberService.addMember(member);
    }
}
