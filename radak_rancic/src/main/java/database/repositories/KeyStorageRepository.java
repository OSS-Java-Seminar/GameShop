package database.repositories;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import database.entities.KeyStorage;

@Repository
public interface KeyStorageRepository extends JpaRepository<KeyStorage, UUID>{

}
