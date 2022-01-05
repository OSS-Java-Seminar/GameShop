package backend.Adminpanel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.service.KeyStorageService;
import database.entities.KeyStorage;

@RestController
@RequestMapping("/admin/keys")
public class AdminKeyStorageController {
	
	@Autowired
	private KeyStorageService keyStorageService;
	
	@GetMapping("/getall")
	public List<KeyStorage>getAll(){
		return keyStorageService.getAllKeys();
	}
	
	@PutMapping("/add")
	public String addKey(@RequestBody KeyStorage k) {
		if (keyStorageService.ifKeyExists(k.getKey())) {
			return "Game with this key already exist";
		}
		else {
			keyStorageService.addKey(k);
			return "Key added";
		}
	}
	
	@DeleteMapping("/deleteall")
	public String deleteKeys(@RequestParam String gName) {
		keyStorageService.deleteKeys(gName);
		return "All keys for game "+gName+" deleted";
	}
}
