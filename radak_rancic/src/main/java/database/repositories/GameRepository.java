package database.repositories;

import database.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;



@Repository
public interface GameRepository extends JpaRepository<Game, UUID>{

}
