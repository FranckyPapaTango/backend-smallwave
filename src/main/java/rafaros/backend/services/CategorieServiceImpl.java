package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.CategorieRepository;
import rafaros.backend.entities.Categorie;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {
	
	@Autowired
	CategorieRepository categorieRepository;

	@Override
	public Categorie save(Categorie categorie) {
		// TODO Auto-generated method stub
		return categorieRepository.save(categorie);
	}

	@Override
	public Categorie findById(Long id) {
		// TODO Auto-generated method stub
		return categorieRepository.findById(id).orElse(null);
	}

	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return categorieRepository.findAll();
	}

	@Override
	public Categorie update(Categorie categorie) {
		// TODO Auto-generated method stub
		return categorieRepository.save(categorie);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categorieRepository.deleteById(id);
	}

}
