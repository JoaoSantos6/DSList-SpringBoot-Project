package com.joaoJottaSeis.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaoJottaSeis.dslist.dto.GameMinDTO;
import com.joaoJottaSeis.dslist.services.GameService;

//camada que vai disponibilizar a API pro front-end
@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	//injeta o Service que por sua vez injeta o Repository
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
