package com.hyeon.board_0805.repository;

import com.hyeon.board_0805.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
