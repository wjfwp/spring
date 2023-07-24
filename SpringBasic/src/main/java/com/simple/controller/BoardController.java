package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardController {

	@Autowired
	@Qualifier("boardService")
	BoardService boardService;

	//등록화면
	@RequestMapping("/boardRegister")
	public void BoardRegister() {
	}
	
	//목록화면
	@RequestMapping("/boardList")
	public String BoardList(Model model) {
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		
		return "/service/boardList";
	}
	
	//결과화면
	@RequestMapping("/boardResult")
	public void BoardResult() {
		
	}
	
	
	//등록요청
	@RequestMapping(value="/boardForm", method=RequestMethod.POST)
	public String BoardForm(BoardVO vo) {
		boardService.boardRegist(vo);
		return "service/boardResult";
	}
	
	//삭제요청
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("bno") int num) {
		boardService.boardDelete(num);
		return "redirect:/service/boardList";
	}
	
	
}
