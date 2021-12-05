package database.repositories;

import org.springframework.data.repository.CrudRepository;
import database.entities.Game;

public interface gameRepository extends CrudRepository<Long,Game>{

}
