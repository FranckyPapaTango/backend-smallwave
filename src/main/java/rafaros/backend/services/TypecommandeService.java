package rafaros.backend.services;

import rafaros.backend.entities.Typecommande;

import java.util.List;

public interface TypecommandeService {
	public Typecommande save (Typecommande typecommande);
	public Typecommande findById(Long id);
	public List<Typecommande> findAll();
	public Typecommande update(Typecommande typecommande);
	public void delete(Long id);
}
