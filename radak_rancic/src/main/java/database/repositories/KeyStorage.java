package database.repositories;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyStorage extends JpaRepository<KeyStorage, UUID>{

}
