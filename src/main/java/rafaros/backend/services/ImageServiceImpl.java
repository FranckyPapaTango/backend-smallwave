package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.ImageRepository;
import rafaros.backend.entities.Image;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	ImageRepository imageRepository;

	@Override
	public Image save(Image image) {
		// TODO Auto-generated method stub
		return imageRepository.save(image);
	}

	@Override
	public Image findById(Long id) {
		// TODO Auto-generated method stub
		return imageRepository.findById(id).orElse(null);
	}

	@Override
	public List<Image> findAll() {
		// TODO Auto-generated method stub
		return imageRepository.findAll();
	}

	@Override
	public Image update(Image image) {
		// TODO Auto-generated method stub
		return imageRepository.save(image);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		imageRepository.deleteById(id);
	}

}
