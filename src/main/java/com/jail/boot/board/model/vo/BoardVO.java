package com.jail.boot.board.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//여기 무언가 깔고 작성해줘야함!!
//7/19 porm에서 롬복을 설치해줘야 함!!
//그래야 임포트 가능!!
//Board에서 BoardVO로 바꿔줌 7/19
//@NoArgsConstructor는??
//@AllArgsConstructor는??

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class BoardVO {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private Date boardCreateDate;
	private Date boardUpdateDate;
	private int readCount;
	private String boradYn;
}
