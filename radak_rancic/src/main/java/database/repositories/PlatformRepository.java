package database.repositories;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import database.entities.Invoice;
import database.entities.Platform;

@Transactional
public interface PlatformRepository extends JpaRepository <Platform, UUID> {
	boolean existsByName(String name);
	Long deleteByName(String name);

}
