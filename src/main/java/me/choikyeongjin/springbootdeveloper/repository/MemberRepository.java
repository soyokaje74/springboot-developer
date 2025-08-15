package me.choikyeongjin.springbootdeveloper.repository;

import me.choikyeongjin.springbootdeveloper.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByName(String name);

//    @Query("select * from Member m where m.name = ?1")
//    Optional<Member> findByNameQuery(String name);
}
