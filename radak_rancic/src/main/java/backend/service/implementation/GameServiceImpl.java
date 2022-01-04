package backend.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.service.GameService;
import database.entities.Game;
import database.repositories.GameRepository;
import database.repositories.UserRepository;

@Service
public class GameServiceImpl implements GameService {
	@Autowired
	private GameRepository gameRepository;

	public Game findbyGameName(String name) {
		return gameRepository.findByName(name);
	}
	public String addGame(Game g) {
		if(gameRepository.existsByName(g.getName())) {
			return "Game alreday exists";
		}
		else {
			gameRepository.save(g);
			return "Game added";
		}
	}
	public String deleteGame(Game g) {
		if(gameRepository.existsByName(g.getName())) {
			gameRepository.delete(g);
			return "Game alreday exists";
		}
		else {
			gameRepository.save(g);
			return "Game added";
		}
	}
}
