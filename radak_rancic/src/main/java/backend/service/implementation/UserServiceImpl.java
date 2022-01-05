package backend.service.implementation;

import java.util.List;
import java.util.UUID;

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

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public boolean ifUserExists(String username) {
		return userRepository.existsByUsername(username);
	}

	@Override
	public User findUserById(UUID id) {
		return userRepository.findById(id).get();
	}

	
	
	
}
