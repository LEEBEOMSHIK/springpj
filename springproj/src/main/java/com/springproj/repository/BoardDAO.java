package com.springproj.repository;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproj.vo.BoardDTO;

@Repository
public class BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardDTO> getList(){
		List<BoardDTO> list = sqlSession.selectList("boardMapper.boardList");
		return list;
	}
	
	public int insertBoard(BoardDTO boardDTO) {
		int insertResult = sqlSession.selectOne("boardMapper.boardInsert",boardDTO);
		return insertResult;
	}
	
	public int deleteBoard(BoardDTO boardDTO) {
		int deleteResult = sqlSession.selectOne("boardMapper.boardDelete",boardDTO);
		return deleteResult;
	}
	
	public int updateBoard(BoardDTO boardDTO) {
		int updateResult = sqlSession.selectOne("boardMapper.boardUpdate",boardDTO);
		return updateResult;
	}
	
	public BoardDTO boardOne(int no) {
		BoardDTO boardDTO = sqlSession.selectOne("boardMapper.boardOne", no);
		return boardDTO;
	}
}
