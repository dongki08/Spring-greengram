package com.green.springfirst.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class BoardDetailVo {
    private int iboard;
    private String title;
    private String cntns;
    private String writer;
    private String createdAt;
}
