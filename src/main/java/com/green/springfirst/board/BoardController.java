package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/board")
    public List<BoardVo> getBoard() {
        return service.getBoard();
    }

    @GetMapping("/board/{iboard}")
    public BoardDetailVo getBoardDetail(@PathVariable int iboard) {
        System.out.println(iboard);
        return service.getBoardById(iboard);
    }

    @PutMapping("/board")
    public ResVo putBoard(@RequestBody BoardUpdDto dto) {
        int result = service.putBoard(dto);
        return new ResVo(result);
    }

    @DeleteMapping("/board/{iboard}")
    public ResVo delBoard(@PathVariable int iboard) {
        System.out.println(iboard);
        int result = service.delBoard(iboard);
        System.out.println("result : " + result);
        return new ResVo(result);
    }

    @PostMapping("/board")
    public ResVo insBoard(@RequestBody BoardInsDto dto) {
        System.out.println(dto);
        int result = service.insBoard(dto);
        System.out.println("result : " + result);
        return new ResVo(result);
    }

}
