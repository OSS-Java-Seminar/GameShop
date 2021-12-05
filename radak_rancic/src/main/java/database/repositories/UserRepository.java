package database.repositories;

import database.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	@Component
	public class UserDataLoader {
		
		@Autowired
		UserRepository userRepository;
		public void save(User s) {
			userRepository.save(s);
		}
		@Bean
		public CommandLineRunner loadData(UserRepository userRepository) {

			return (args) -> {
				User newUser = new User(null, null, null, null, 0, 0);

				userRepository.save(newUser);
			};
		}
	}
}
