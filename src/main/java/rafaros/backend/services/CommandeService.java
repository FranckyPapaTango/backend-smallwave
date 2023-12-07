package rafaros.backend.services;

import rafaros.backend.entities.Commande;

import java.util.List;

public interface CommandeService {
	public Commande save (Commande commande);
	public Commande findById(Long id);
	public List<Commande> findAll();
	public Commande update(Commande commande);
	public void delete(Long id);
}
