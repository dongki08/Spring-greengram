package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    //int delBoard(BoardInsDto dto1);
    int insBoard(BoardInsDto dto);
    List<BoardVo> selBoardList();

    BoardDetailVo selBoardById(int iboard);
    int delBoard(int iboard);

    int updBoard(BoardUpdDto dto);
}
