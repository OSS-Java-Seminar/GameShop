package database.repositories;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import database.entities.KeyStorage;

@Transactional
public interface KeyStorageRepository extends JpaRepository<KeyStorage, UUID>{
	boolean existsByKey(String key);
	void deleteByGameName(String name);
}
