package org.zerock.ex2106.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ex2106.entitiy.Member;

public interface MemberRepository  extends JpaRepository<Member, String> {
}
