package rafaros.backend.services;

import rafaros.backend.entities.Categorie;

import java.util.List;

public interface CategorieService {
	
	public Categorie save (Categorie categorie);
	public Categorie findById(Long id);
	public List<Categorie> findAll();
	public Categorie update(Categorie categorie);
	public void delete(Long id);


}
