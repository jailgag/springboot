package com.jail.boot.board.model.store;

import org.apache.ibatis.session.SqlSession;

import com.jail.boot.board.controller.dto.BoardAddRequest;

public interface BoardStore {
	
	//아래 SqlSession임포트 안됨....다른것도...이유는??
	//porm.xml에 파일 추가해줬음...
	//초기 셋팅법?자료가 없음...기존거 복사 붙여넣기 함...
	int insertBoard(SqlSession session, BoardAddRequest board);
}
