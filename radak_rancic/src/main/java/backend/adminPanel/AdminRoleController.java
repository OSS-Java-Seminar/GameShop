package backend.adminPanel;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.service.RoleService;
import database.entities.Payment;
import database.entities.Role;

@RestController
@RequestMapping("/admin/role")
public class AdminRoleController {
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/getall")
	public List<Role>findAll(){
		return roleService.getAll();
	}
	@PostMapping("/add")
	public String addNew(@RequestBody Role r) {
		String pName=r.getRoleName();
		if(roleService.ifRoleExist(pName)) {
			return "Role already exist";
		}
		roleService.addRole(r);
		return "Role added";
	}
	@DeleteMapping("/delete")
	public String deleteOne(@RequestParam String type) {
		String pName=type;
		if(roleService.ifRoleExist(pName)) {
			roleService.deleteRoleByName(pName);
			return "Role deleted";
		}
		return "Role not exist";
	}
	@PutMapping("/update/{id}")
	public String updatePayment(@PathVariable UUID id) {
		Role p=roleService.findByRoleId(id);
		//Ode triba dodat da se iz forme skupe podatci i onda priko settera postave
		return "Measure succesfully updated";
	}
}
