package org.zerock.ex2106.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.ex2106.dto.GuestbookDTO;
import org.zerock.ex2106.dto.PageRequestDTO;
import org.zerock.ex2106.dto.PageResultDTO;
import org.zerock.ex2106.entitiy.Guestbook;

@SpringBootTest
public class GuestbookServiceTest {

    @Autowired
    private GuestbookService service;

    @Test
    public void testList() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();

        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);

        for (GuestbookDTO guestbookDTO : resultDTO.getDtoList()) {
            System.out.println(guestbookDTO);
        }
    }

    @Test
    public void testRegister() {

        GuestbookDTO guestbookDTO = GuestbookDTO.builder()
                .title("Sample Title...")
                .content("Sample Content...")
                .writer("user0")
                .build();
        System.out.println(service.register(guestbookDTO));
    }
}
