package com.springproj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.repository.BoardDAO;
import com.springproj.vo.BoardDTO;

@Service
public class BoardSVC {
	
	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> getList(){
		List<BoardDTO> list = boardDAO.getList();
		return list;
	}
	
	public int insertBoard(BoardDTO boardDTO) {
		int insertResult = boardDAO.insertBoard(boardDTO);
		return insertResult;
	}
	
	public int deleteBoard(BoardDTO boardDTO) {
		int deleteResult = boardDAO.deleteBoard(boardDTO);
		return deleteResult;
	}
	
	public int updateBoard(BoardDTO boardDTO) {
		int updateResult = boardDAO.updateBoard(boardDTO);
		return updateResult;
	}
	
	public BoardDTO boardOne(int no) {
		BoardDTO boardDTO = boardDAO.boardOne(no);
		return boardDTO;
	}

}
