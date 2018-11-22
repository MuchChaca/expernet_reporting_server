package com.gpch.login.service;

import com.gpch.login.model.Game;
import com.gpch.login.model.User;
import com.gpch.login.model.Score;
import com.gpch.login.repository.GameRepository;
import com.gpch.login.repository.UserRepository;
import com.gpch.login.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scoreService")
public class ScoreService {

	private ScoreRepository scoreRepository;
	private UserRepository userRepository;
	private GameRepository gameRepository;

	@Autowired
	public ScoreService(UserRepository userRepository, ScoreRepository scoreRepository, GameRepository gameRepository) {
		this.userRepository = userRepository;
		this.gameRepository = gameRepository;
		this.scoreRepository = scoreRepository;
	}

	public List<Score> findScoresByUser(User user) {
		return scoreRepository.findByUser(user);
	}

	public List<Score> findScoresByGame(Game game) {
		return scoreRepository.findByGame(game);
	}

	public Score save(Score score) {
		return scoreRepository.save(score);
	}

	public List<Object> findAll() {
		return scoreRepository.findAll();
	}
}