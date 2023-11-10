package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BoardService {

    public int insBoard(BoardInsDto dto) {
        return mapper.insBoard(dto);
    }
    public int delBoard(int iboard) {
        return mapper.delBoard(iboard);
    }

    private final BoardMapper mapper;
    public List<BoardVo> getBoard() {
        return mapper.selBoardList();
    }
    public BoardDetailVo getBoardById(int iboard) {
        return mapper.selBoardById(iboard);
    }
    public int putBoard(BoardUpdDto dto) {
        return mapper.updBoard(dto);
    }
}
