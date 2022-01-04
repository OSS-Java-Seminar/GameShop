package backend.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.service.UserService;
import database.entities.User;
import database.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	public User findByUserName(String username) {
		return userRepository.findByUsername(username);
	}
	
	public String addUser(User u) {
		if(userRepository.existsByUsername(u.getUsername())) {
			return "Username already exists";
		}
		else {
			userRepository.save(u);
			return "User created";
		}
	}
	
	public String deleteUser(String username) {
		if(userRepository.existsByUsername(username)) {
			userRepository.delete(userRepository.findByUsername(username));
			return "User deleted";
		}
		else {
			return "User not exists";
		}
	}
	
}
