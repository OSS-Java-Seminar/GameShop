package backend.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.service.PictureService;
import database.entities.Picture;
import database.repositories.PictureRepository;

@Service
public class PictureServiceImpl implements PictureService {
	
	@Autowired
	private PictureRepository pictureRepository;

	
	public void addPicture(Picture p) {
		pictureRepository.save(p);
	}
	

}
