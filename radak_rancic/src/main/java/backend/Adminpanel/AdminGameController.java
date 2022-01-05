package backend.Adminpanel;

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

import backend.service.GameService;
import backend.service.PictureService;
import database.entities.Game;
import database.entities.Genre;
import database.entities.Picture;

@RestController
@RequestMapping("/admin/games")
public class AdminGameController {
	
	@Autowired
	private GameService gameService;
	@Autowired
	private PictureService pictureService;
	
	@GetMapping("/getall")
	public List<Game>findAll(){
		return gameService.findAllGames();
	}
	@PostMapping("/add")
	public String addNew(@RequestBody Game g) {
		pictureService.addPicture(g.getPicture());
		String pName=g.getName();
		if(gameService.ifGameExists(pName)) {
			return "Game already exist";
		}
		gameService.addGame(g);
		return "Genre added";
	}
	@DeleteMapping("/delete")
	public String deleteOne(@RequestParam String name) {
		String pName=name;
		if(gameService.ifGameExists(pName)) {
			gameService.deleteGame(null);
			return "Game deleted";
		}
		return "Game not exist";
	}
	@PutMapping("/update/{id}")
	public String updatePayment(@PathVariable UUID id) {
		Game g=gameService.findGameById(id);
		//Ode triba dodat da se iz forme skupe podatci i onda priko settera postave
		return "Game succesfully updated";
	}
}
