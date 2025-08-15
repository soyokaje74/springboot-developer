package me.choikyeongjin.springbootdeveloper.service;

import me.choikyeongjin.springbootdeveloper.domain.Member;
import me.choikyeongjin.springbootdeveloper.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
