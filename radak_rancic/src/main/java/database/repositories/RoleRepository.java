package database.repositories;

import database.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID>{
	Role findByRoleName(String roleName);

}
