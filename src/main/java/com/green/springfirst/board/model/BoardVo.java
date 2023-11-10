package com.green.springfirst.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class BoardVo {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createAt;
}
