package com.jail.boot.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.jail.boot.board.controller.dto.BoardAddRequest;
import com.jail.boot.board.model.service.BoardService;

import jakarta.servlet.http.HttpSession;
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
	
	@PostMapping("/insert")
	public String writeBoard(@ModelAttribute BoardAddRequest board,
			MultipartFile uploadFile,
			HttpSession session,
			Model model) {
		int result = bService.insertBoard(board);
		System.out.println(result);
		return "redirect:/board/list";
	}
}
