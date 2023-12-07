package rafaros.backend.services;

import rafaros.backend.entities.Chatteur;

import java.util.List;

public interface ChatteurService {
	public Chatteur save (Chatteur chatteur);
	public Chatteur findById(Long id);
	public List<Chatteur> findAll();
	public Chatteur update(Chatteur chatteur);
	public void delete(Long id);
}
