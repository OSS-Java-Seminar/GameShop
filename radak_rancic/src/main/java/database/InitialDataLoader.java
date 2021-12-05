package database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import database.entities.User;
import database.repositories.UserRepository;

@Component
public class InitialDataLoader implements CommandLineRunner {

    private UserRepository userRepository;
	
    public InitialDataLoader(UserRepository userRepository) {
    	this.userRepository = userRepository;
    }
	@Override
	public void run(String... args) {
		User user = new User("test", "testPass", "test@mail.com", 0);
		userRepository.save(user);
	}

}