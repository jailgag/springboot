package com.jail.boot.board.model.service;


import com.jail.boot.board.controller.dto.BoardAddRequest;

public interface BoardService {
	
	int insertBoard(BoardAddRequest board);
}
