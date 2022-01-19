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

import backend.service.GenreService;
import backend.service.UserService;
import database.entities.Genre;
import database.entities.User;


@RestController
@RequestMapping("/admin/user")
public class AdminUserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/getall")
	public List<User>findAll(){
		return userService.getAllUsers();
	}
	@PostMapping("/add")
	public String addNew(@RequestBody User u) {
		String pName=u.getUsername();
		if(userService.ifUserExists(pName)) {
			return "User already exist";
		}
		userService.addUser(u);
		return "User added";
	}
	@DeleteMapping("/delete")
	public String deleteOne(@RequestParam String name) {
		String pName=name;
		if(userService.ifUserExists(pName)) {
			userService.deleteUser(pName);
			return "User deleted";
		}
		return "User not exist";
	}
	@PutMapping("/update/{id}")
	public String updatePayment(@PathVariable UUID id) {
		User u=userService.findUserById(id);
		//Ode triba dodat da se iz forme skupe podatci i onda priko settera postave
		return "User succesfully updated";
	}
}
