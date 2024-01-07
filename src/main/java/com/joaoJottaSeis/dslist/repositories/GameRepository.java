package com.joaoJottaSeis.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaoJottaSeis.dslist.entities.Game;

//Componente que realiza operacoes no banco com a ajuda do framework Spring
public interface GameRepository extends JpaRepository<Game, Long>{

	
}
