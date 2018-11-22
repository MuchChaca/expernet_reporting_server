package com.gpch.login.repository;

import com.gpch.login.model.Game;
import com.gpch.login.model.User;
import com.gpch.login.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("scoreRepository")
public interface ScoreRepository extends JpaRepository<Score, Long> {
	List<Score> findByUser(User user);

	List<Score> findByGame(Game game);

	// List<Score> findAll();
}