package com.godcoder.myrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godcoder.myrest.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
	
	

}
