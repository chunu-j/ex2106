package org.zerock.ex2106.service;

import org.zerock.ex2106.dto.BoardDTO;
import org.zerock.ex2106.dto.PageRequestDTO;
import org.zerock.ex2106.dto.PageResultDTO;
import org.zerock.ex2106.entitiy.Board;
import org.zerock.ex2106.entitiy.Member;

public interface BoardService {

   Long register(BoardDTO dto);

    PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO);

    BoardDTO get(Long bno);

    void removeWithReplies(Long bno); // 삭제 기능

    void modify(BoardDTO boardDTO);

  default Board dtoToEntity(BoardDTO dto) {
       Member member = Member.builder().email(dto.getWriterEmail()).build();

       Board board = Board.builder()
               .bno(dto.getBno())
               .title(dto.getTitle())
               .content(dto.getContent())
               .writer(member)
               .build();
       return board;
   }

   default BoardDTO entityToDTO(Board board, Member member, Long replyCount) {
       BoardDTO boardDTO = BoardDTO.builder()
               .bno(board.getBno())
               .title(board.getTitle())
               .content(board.getContent())
               .regDate(board.getRegDate())
               .modDate(board.getModDate())
               .writerEmail(member.getEmail())
               .writerName(member.getName())
               .replyCount(replyCount.intValue())  // long 으로 나오므로 int로 처리하도록
               .build();
       return boardDTO;
   }
}
