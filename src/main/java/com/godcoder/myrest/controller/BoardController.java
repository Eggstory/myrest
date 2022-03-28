package com.godcoder.myrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.godcoder.myrest.model.Board;
import com.godcoder.myrest.repository.BoardRepository;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private BoardRepository boardRepository;
	
	public BoardController(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Board> boards = boardRepository.findAll();
		model.addAttribute("boards", boards);
		
		return "board/list";
	}

}
