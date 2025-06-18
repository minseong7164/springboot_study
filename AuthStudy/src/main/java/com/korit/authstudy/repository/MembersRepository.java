package com.korit.authstudy.repository;

import com.korit.authstudy.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Member, Integer> {
}
// jpa를 쓰기위해 만든다 (아이디의 자료형이 들어온다).