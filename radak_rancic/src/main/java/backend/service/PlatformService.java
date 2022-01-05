package backend.service;

import java.util.List;
import java.util.UUID;

import database.entities.Platform;

public interface PlatformService {
	public List<Platform> findAllPlatforms();
	boolean ifPlatformExist(String name);
	void addPlatform(Platform p);
	void deletePlatform(String name);
	Platform findPlatformById(UUID id);

}
