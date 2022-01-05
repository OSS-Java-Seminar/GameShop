package backend.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.service.KeyStorageService;
import database.entities.KeyStorage;
import database.repositories.KeyStorageRepository;

@Service
public class KeyStorageServiceImpl implements KeyStorageService {
	
	@Autowired
	private KeyStorageRepository keyStorageRepository;

	public List<KeyStorage> getAllKeys() {
		return keyStorageRepository.findAll();
	}

	public boolean ifKeyExists(String key) {
		return keyStorageRepository.existsByKey(key);
	}

	public void addKey(KeyStorage k) {
		keyStorageRepository.save(k);
	}

	public void deleteKeys(String name) {
		keyStorageRepository.deleteByGameName(name);
	}
	

}
