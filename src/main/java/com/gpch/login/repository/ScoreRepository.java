package com.gpch.login.repository;

import com.gpch.login.model.Game;
import com.gpch.login.model.User;
import com.gpch.login.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("scoreRepository")
public interface ScoreRepository extends JpaRepository<Score, Long> {
	Score findByUser(User user);
}