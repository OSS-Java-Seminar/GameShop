package backend.service.implementation;

import java.util.List;
import java.util.UUID;

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
	public void addGame(Game g) {
		gameRepository.save(g);
	}
	public void deleteGame(String name) {
		gameRepository.deleteByname(name);
		
	}
	
	public List<Game> findAllGames() {
		return gameRepository.findAll();
	}
	public boolean ifGameExists(String name) {
		return gameRepository.existsByName(name);
	}
	
	public Game findGameById(UUID id) {
		return gameRepository.findById(id).get();
	}
}
