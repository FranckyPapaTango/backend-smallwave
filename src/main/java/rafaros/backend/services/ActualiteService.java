package rafaros.backend.services;

import rafaros.backend.entities.Actualite;

import java.util.List;

public interface ActualiteService {
	
	public Actualite save (Actualite actualite);
	public Actualite findById(Long id);
	public List<Actualite> findAll();
	public Actualite update(Actualite actualite);
	public void delete(Long id);

}
