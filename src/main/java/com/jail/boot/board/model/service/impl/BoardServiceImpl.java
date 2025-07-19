package com.jail.boot.board.model.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.jail.boot.board.controller.dto.BoardAddRequest;
import com.jail.boot.board.model.service.BoardService;
import com.jail.boot.board.model.store.BoardStore;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private final BoardStore bStore;
	private final SqlSession sessionl;
	
// @RequiredArgsConstructor는 아래 주석코드 대체 코드!
//	public BoardServiceImpl() {}
	
//	public BoardServiceImpl(BoardStore bStore, SqlSession session) {
//		this.bStore = bStore;
//		this.sessionl = session;
//	}
	
	@Override
	public int insertBoard(BoardAddRequest board) {
		// TODO Auto-generated method stub
		int result = bStore.insertBoard(sessionl, board);
		return result;
	}

}
