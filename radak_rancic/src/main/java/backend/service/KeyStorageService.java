package backend.service;

import java.util.List;

import database.entities.KeyStorage;

public interface KeyStorageService {
	List<KeyStorage>getAllKeys();
	boolean ifKeyExists(String key);
	public void addKey(KeyStorage k);
	public void deleteKeys(String name);

}
