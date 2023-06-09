package com.forKuri.board.controller;

import com.forKuri.board.dto.BoardDto;
import com.forKuri.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
        public String saveForm(){
        return "save";
        }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDto boardDto){
        int saveResult = boardService.save(boardDto);
        if(saveResult > 0){
            return "redirect:/board/";
        }else{
            return "save";
        }
    }
}
