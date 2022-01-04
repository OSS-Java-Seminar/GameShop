package database.repositories;

import database.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
	User findByUsername(String name);
	boolean existsByUsername(String username);
}
