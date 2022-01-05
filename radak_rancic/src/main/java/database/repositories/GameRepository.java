package database.repositories;

import database.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import javax.transaction.Transactional;



@Transactional
public interface GameRepository extends JpaRepository<Game, UUID>{
	Game findByName(String name);
	boolean existsByName(String name);
	Long deleteByname(String name);
}
