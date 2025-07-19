package com.jail.boot.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jail.boot.board.model.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
//아래코드 더적을거 있음!
public class BoardController {
	
	private final BoardService bService;
	
	@GetMapping("/insert")
	public String showWriteForm() {
		return "board/insert";
	}
}
