package com.jail.boot.board.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardAddRequest {
	private String boardTitle;
	private String boardContent;
	private int memberNo;
}
