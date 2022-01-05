package backend.service.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.service.RoleService;
import database.entities.Role;
import database.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Role> getAll() {
		return roleRepository.findAll();
	}

	
	public boolean ifRoleExist(String rName) {
		return roleRepository.existsByRoleName(rName);
	}
	public void addRole(Role r) {
		roleRepository.save(r);
		
	}
	
	public void deleteRoleByName(String roleName) {
		roleRepository.deleteByRoleName(roleName);
	}
	
	public Role findByRoleId(UUID id) {
		return roleRepository.findById(id).get();
	}

}
