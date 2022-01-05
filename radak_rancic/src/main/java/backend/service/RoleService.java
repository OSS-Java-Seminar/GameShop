package backend.service;

import java.util.List;
import java.util.UUID;

import database.entities.Role;

public interface RoleService {
	List<Role>getAll();
	boolean ifRoleExist(String rName);
	void addRole(Role r);
	void deleteRoleByName(String roleName);
	Role findByRoleId(UUID id);

}
