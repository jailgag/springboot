package com.jail.boot.board.model.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jail.boot.board.controller.dto.BoardAddRequest;
import com.jail.boot.board.model.store.BoardStore;

@Repository
public class BoardStoreLogic implements BoardStore  {

	@Override
	public int insertBoard(SqlSession session, BoardAddRequest board) {
		// TODO Auto-generated method stub
		int result = session.insert("BoardMapper.insertBoard",board);
		return result;
	}

}
