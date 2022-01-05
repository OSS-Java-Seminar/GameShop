package backend.service.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.service.PlatformService;
import database.entities.Platform;
import database.repositories.PlatformRepository;


@Service
public class PlatformServiceImpl implements PlatformService {
	@Autowired
	PlatformRepository platformRepository;

	public List<Platform> findAllPlatforms() {
		return platformRepository.findAll();
	}

	public boolean ifPlatformExist(String name) {
		return platformRepository.existsByName(name);
	}

	public void addPlatform(Platform p) {
		platformRepository.save(p);
	}

	public void deletePlatform(String name) {
		platformRepository.deleteByName(name);
	}

	public Platform findPlatformById(UUID id) {
		return platformRepository.findById(id).get();
	}
	
	
	

}
