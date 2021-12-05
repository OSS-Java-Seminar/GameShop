package database.repositories;

import database.entities.GameUser;
import org.springframework.data.repository.CrudRepository;

public interface GameUserRepository extends CrudRepository<GameUser, Long> {

}
