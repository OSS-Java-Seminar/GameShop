package database.repositories;

import database.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import javax.transaction.Transactional;

//@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Role, UUID>{
	Role findByRoleName(String roleName);
	boolean existsByRoleName(String name);
	Long deleteByRoleName(String name);
}
