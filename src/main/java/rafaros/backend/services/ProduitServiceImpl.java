package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.ProduitRepository;
import rafaros.backend.entities.Produit;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService{
	
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public Produit save(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public Produit findById(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).orElse(null);
	}

	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit update(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
	}

}
