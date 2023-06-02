package com.forKuri.board.repository;

import com.forKuri.board.dto.BoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    public int save(BoardDto boardDto) {
    }
}
