package backend.service;

import java.util.List;
import java.util.UUID;

import database.entities.*;

public interface UserService {
	User findByUserName(String username);
	String addUser(User u);
	String deleteUser(String username);
	List<User>getAllUsers();
	boolean ifUserExists(String username);
	User findUserById(UUID id);
}
