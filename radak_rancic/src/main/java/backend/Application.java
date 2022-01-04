package backend;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import database.entities.Game;
import database.entities.Genre;
import database.entities.KeyStorage;
import database.entities.Payment;
import database.entities.Role;
import database.entities.User;
import database.repositories.GameRepository;
import database.repositories.GenreRepository;
import database.repositories.KeyStorageRepository;
import database.repositories.PaymentRepository;
import database.repositories.RoleRepository;
import database.repositories.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	PaymentRepository paymentRepository;
	@Autowired
	GenreRepository genreRepository;
	@Autowired
	KeyStorageRepository keyStorageRepository;
	@Autowired
	GameRepository gameRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
	public void run(String... args) {
   	roleRepository.save(new Role(null,"admin"));
   	roleRepository.save(new Role(null,"user"));
    	
   	paymentRepository.save(new Payment(null,"mastercard"));
  	paymentRepository.save(new Payment(null,"visa"));
   	paymentRepository.save(new Payment(null,"pay_pal"));
    	
   	genreRepository.save(new Genre(null,"horor"));
   	genreRepository.save(new Genre(null,"sport"));
   	genreRepository.save(new Genre(null,"war"));
  	
   	userRepository.save(new User(null,"user","user","user@gmail.com",null,0,roleRepository.findByRoleName("user"),null));
//    	Set<Genre> tmp = new HashSet<>();
//    	tmp.add(genreRepository.findByGenreName("sport"));
//   	gameRepository.save(new Game(null,"NHL 2021",tmp,500,""));
	}
}