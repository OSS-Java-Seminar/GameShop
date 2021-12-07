package database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import database.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
