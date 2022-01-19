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

import backend.service.PlatformService;
import database.entities.Genre;
import database.entities.Platform;

@RestController
@RequestMapping("/admin/platform")
public class AdminPlatformController {
	
	@Autowired
	PlatformService platformService;
	
	@GetMapping("/getall")
	public List<Platform>findAll(){
		return platformService.findAllPlatforms();
	}
	@PostMapping("/add")
	public String addNew(@RequestBody Platform p) {
		String pName=p.getName();
		if(platformService.ifPlatformExist(pName)) {
			return "Platform already exist";
		}
		platformService.addPlatform(p);
		return "Platform added";
	}
	@DeleteMapping("/delete")
	public String deleteOne(@RequestParam String name) {
		String pName=name;
		if(platformService.ifPlatformExist(pName)) {
			platformService.deletePlatform(pName);
			return "Genre deleted";
		}
		return "Genre not exist";
	}
	@PutMapping("/update/{id}")
	public String updatePayment(@PathVariable UUID id) {
		Platform p=platformService.findPlatformById(id);
		//Ode triba dodat da se iz forme skupe podatci i onda priko settera postave
		return "Genre succesfully updated";
	}
	

}
