package backend.service;

import database.entities.*;

public interface UserService {
	User findByUserName(String username);
	String addUser(User u);
	String deleteUser(String username);
}
