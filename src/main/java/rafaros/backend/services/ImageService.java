package rafaros.backend.services;

import rafaros.backend.entities.Image;

import java.util.List;

public interface ImageService {
	public Image save (Image image);
	public Image findById(Long id);
	public List<Image> findAll();
	public Image update(Image image);
	public void delete(Long id);
}
