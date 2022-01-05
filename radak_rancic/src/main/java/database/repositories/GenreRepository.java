package database.repositories;

import database.entities.Genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import javax.transaction.Transactional;

//@Repository
@Transactional
public interface GenreRepository extends JpaRepository<Genre, UUID> {
	Genre findByGenreName(String name);
	boolean existsByGenreName(String type);
	Long deleteByGenreName(String name);
}
