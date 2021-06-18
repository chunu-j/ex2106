package org.zerock.ex2106.service;

import org.zerock.ex2106.dto.GuestbookDTO;
import org.zerock.ex2106.entitiy.Guestbook;

public interface GuestbookService {
    Long register(GuestbookDTO dto);

    default Guestbook dtoToEntity(GuestbookDTO dto) {
        Guestbook entity = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return  entity;
    }
}
