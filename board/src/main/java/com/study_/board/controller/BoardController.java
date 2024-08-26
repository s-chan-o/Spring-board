package com.study_.board.controller;

import com.study_.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @GetMapping("/board/write")
    public String boardwriteForm(){


        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardwritePro(Board board) {

        System.out.println(board.getTitle());

        return "";
    }
}
