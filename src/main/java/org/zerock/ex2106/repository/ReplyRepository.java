package org.zerock.ex2106.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ex2106.entitiy.Reply;

public interface ReplyRepository  extends JpaRepository<Reply, Long> {
}
