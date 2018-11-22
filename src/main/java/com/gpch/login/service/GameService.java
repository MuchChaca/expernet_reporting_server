package com.gpch.login.service;

import com.gpch.login.model.Game;
import com.gpch.login.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

// import com.gpch.login.model.User;
// import com.gpch.login.model.Game;

@Service("gameService")
public class GameService {
	private GameRepository gameRepository;

	@Autowired
	public GameService(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	public Game findUserByName(String name) {
		return gameRepository.findByName(name);
	}

	public Game saveGame(Game game) {
		game.setName(game.getName());
		return gameRepository.save(game);
	}
}