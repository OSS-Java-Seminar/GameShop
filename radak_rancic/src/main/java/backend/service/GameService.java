package backend.service;

import java.util.List;
import java.util.UUID;

import database.entities.Game;

public interface GameService {
	Game findbyGameName(String name);
	void addGame(Game g);
	void deleteGame(String name);
	List<Game>findAllGames();
	boolean ifGameExists(String name);
	Game findGameById(UUID id);

}
