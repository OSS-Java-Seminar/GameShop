package database;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import database.entities.User;
import database.repositories.UserRepository;

@Component
public class InitialDataLoader implements CommandLineRunner {
	
	@Autowired
    private UserRepository userRepository;
	
	
	@Override
	@Transactional
	public void run(String... args) {
		UUID uuid=UUID.randomUUID();
		User user = new User(uuid, "user2","passwd2","user2@gmail.com",null,0,null,null);
		userRepository.save(user);
	}
}