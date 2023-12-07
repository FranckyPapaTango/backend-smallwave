package rafaros.backend.services;

import rafaros.backend.entities.Produit;

import java.util.List;

public interface ProduitService {
	
	public Produit save(Produit produit);
	public Produit findById(Long id);
	public List<Produit> findAll();
	public Produit update(Produit produit);
	public void delete(Long id);
}