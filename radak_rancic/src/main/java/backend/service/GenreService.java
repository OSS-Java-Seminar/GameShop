package backend.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import database.entities.Genre;
import database.entities.Payment;

public interface GenreService {
	List<Genre>findAllGenres();
	boolean ifGenreExists(String genreName);
	void addGenre(Genre g);
	void deleteGenre(String name);
	public Genre findGenreById(UUID id);

}
