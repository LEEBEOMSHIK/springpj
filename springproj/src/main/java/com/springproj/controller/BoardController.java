package com.springproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproj.service.BoardSVC;
import com.springproj.vo.BoardDTO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardSVC boardSVC;
	
	@RequestMapping("/boardList")
	public String getList(Model model) {
		List<BoardDTO> list = boardSVC.getList();
		model.addAttribute("boardList", list);
		return "list";
	}
	
	@RequestMapping("/insertBoard")
	public String insertBoard(@ModelAttribute BoardDTO boardDTO) {
		int insertResult = boardSVC.insertBoard(boardDTO);
		if(insertResult < 1) {
			System.out.println("insert 실패");
		}
		return "redirect:/boardList";
	}
	
	@RequestMapping("/deleteBoard")
	public String deleteBoard(@ModelAttribute BoardDTO boardDTO) {
		int deleteResult = boardSVC.deleteBoard(boardDTO);
		if(deleteResult < 1) {
			System.out.println("delete 실패");
		}
		return "redirect:/boardList";
	}
	
	@RequestMapping("/updateBoard")
	public String updateBoard(@ModelAttribute BoardDTO boardDTO) {
		int updateBoard = boardSVC.updateBoard(boardDTO);
		if(updateBoard < 1) {
			System.out.println("update 실패");
		}
		return "/detailView";
	}
	
	@RequestMapping("/detailView")
	public String boardOne(@ModelAttribute int no,Model model) {
		BoardDTO boardDTO = boardSVC.boardOne(no);
		model.addAttribute("boardOne",boardDTO);
		return "/detailView";
	}
	
	@RequestMapping("/write")
	public String writeForm() {
		return "/write";
	}

}
