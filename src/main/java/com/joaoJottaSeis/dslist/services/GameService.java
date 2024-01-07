package com.joaoJottaSeis.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaoJottaSeis.dslist.dto.GameDTO;
import com.joaoJottaSeis.dslist.dto.GameMinDTO;
import com.joaoJottaSeis.dslist.entities.Game;
import com.joaoJottaSeis.dslist.repositories.GameRepository;

@Service
public class GameService {

	//o GameRepository eh um componente do sistema. Logo precisa-se
	//chamar o GameRepository para a instancia atual com o Autowired
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
		
	}
	
	//busca no DB todos os games trazendo em forma de listas
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		//transformando uma lista de games em uma lista com somente os dados necessarios pra API
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
