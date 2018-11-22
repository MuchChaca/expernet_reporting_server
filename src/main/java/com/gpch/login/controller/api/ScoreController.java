package com.gpch.login.controller.api;

import com.gpch.login.model.Score;
import com.gpch.login.service.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.lang.Exception;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequestMapping(value = { "/api" })
public class ScoreController {
	// @Autowired
	// private UserService userService;

	// @Autowired
	// private GameService gameService;

	@Autowired
	private ScoreService scoreService;

	/**
	 * POST /new --> Create a new task todo and save it in the database.
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = { "application/json" })
	public Object add(@RequestBody Score score) {
		String scoreId = "";

		try {
			scoreService.save(score);
			scoreId = String.valueOf(score.getId());
		} catch (Exception ex) {
			return "Error creating the score task: " + ex.toString();
		}
		return score;
	}

	/**
	 * POST /new --> Create a new task todo and save it in the database.
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET, consumes = { "application/json" })
	public List<Object> all() {
		List<Score> scores;

		try {
			// scores = scoreService.findAll();
		} catch (Exception ex) {
			List<Object> pex = new ArrayList<>();
			pex.add(new Object("Error retrieving all scores"));
			return pex;
		}
		return scoreService.findAll();
	}
}