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
import database.entities.Genre;
import database.entities.Payment;

@RestController
@RequestMapping("/admin/genre")
public class AdminGenreController {
	
	@Autowired
	private GenreService genreService;
	
	@GetMapping("/getall")
	public List<Genre>findAll(){
		return genreService.findAllGenres();
	}
	@PostMapping("/add")
	public String addNew(@RequestBody Genre g) {
		String pName=g.getGenreName();
		if(genreService.ifGenreExists(pName)) {
			return "Genre already exist";
		}
		genreService.addGenre(g);
		return "Genre added";
	}
	@DeleteMapping("/delete")
	public String deleteOne(@RequestParam String name) {
		String pName=name;
		if(genreService.ifGenreExists(pName)) {
			genreService.deleteGenre(pName);
			return "Genre deleted";
		}
		return "Genre not exist";
	}
	@PutMapping("/update/{id}")
	public String updatePayment(@PathVariable UUID id) {
		Genre g=genreService.findGenreById(id);
		//Ode triba dodat da se iz forme skupe podatci i onda priko settera postave
		return "Genre succesfully updated";
	}
}
