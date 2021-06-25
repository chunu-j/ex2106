package org.zerock.ex2106.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.ex2106.dto.BoardDTO;
import org.zerock.ex2106.dto.PageRequestDTO;
import org.zerock.ex2106.dto.PageResultDTO;

@SpringBootTest
public class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    public void testModify(){
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(2L)
                .title("제목 변경합니다.")
                .content("내용 변경합니다.")
                .build();
        boardService.modify(boardDTO);
    }

/*    @Test
    public void testGet() {
        Long bno = 100L;
        BoardDTO boardDTO = boardService.get(bno);
        System.out.println(boardDTO);
    }*/

/*    @Test
    public void testList() {
        PageRequestDTO pageRequestDTO = new PageRequestDTO();

        PageResultDTO<BoardDTO, Object[]> result = boardService.getList(pageRequestDTO);

        for (BoardDTO boardDTO : result.getDtoList()) {
            System.out.println(boardDTO);
        }
    }*/

/*    @Test
    public void testRegister(){
        BoardDTO dto = BoardDTO.builder()
                .title("Test")
                .content("Test...")
                .writerEmail("User55@aaa.com")
                .build();

        Long bno = boardService.register(dto);
    }*/
}
