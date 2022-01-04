package backend.service;

import database.entities.Game;

public interface GameService {
	Game findbyGameName(String name);
	String addGame(Game g);
	String deleteGame(Game g);

}
