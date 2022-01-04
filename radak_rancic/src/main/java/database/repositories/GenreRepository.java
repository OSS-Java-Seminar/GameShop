package database.repositories;

import database.entities.Genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface GenreRepository extends JpaRepository<Genre, UUID> {
	Genre findByGenreName(String name);
}
