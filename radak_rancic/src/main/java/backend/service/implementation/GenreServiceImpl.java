package backend.service.implementation;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.service.GenreService;
import database.entities.Genre;
import database.repositories.GenreRepository;

@Service
public class GenreServiceImpl implements GenreService {
	@Autowired
	private GenreRepository genreRepository;

	public List<Genre> findAllGenres() {
		return genreRepository.findAll();
	}

	
	public boolean ifGenreExists(String genreName) {
		return genreRepository.existsByGenreName(genreName);
	}

	@Override
	public void addGenre(Genre g) {
		genreRepository.save(g);
		
	}

	public void deleteGenre(String name) {
		genreRepository.deleteByGenreName(name);
	}


	@Override
	public Genre findGenreById(UUID id) {
		return genreRepository.findById(id).get();
	}
	
	

}
