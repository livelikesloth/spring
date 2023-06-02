package com.forKuri.board.service;

import com.forKuri.board.dto.BoardDto;
import com.forKuri.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public int save(BoardDto boardDto){
        return boardRepository.save(boardDto);
    }
}
