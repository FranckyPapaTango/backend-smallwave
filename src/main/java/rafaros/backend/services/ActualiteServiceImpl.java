package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.ActualiteRepository;
import rafaros.backend.entities.Actualite;

import java.util.List;

@Service
public class ActualiteServiceImpl implements ActualiteService{
	
	@Autowired
	ActualiteRepository actualiteRepository;

	@Override
	public Actualite save(Actualite actualite) {
		// TODO Auto-generated method stub
		return actualiteRepository.save(actualite);
	}

	@Override
	public Actualite findById(Long id) {
		// TODO Auto-generated method stub
		return actualiteRepository.findById(id).orElse(null);
	}

	@Override
	public List<Actualite> findAll() {
		// TODO Auto-generated method stub
		return actualiteRepository.findAll();
	}

	/**
	 * Methode identique au "save" plus haut !!!
	 **/
	@Override
	public Actualite update(Actualite actualite) {
		// TODO Auto-generated method stub
		return actualiteRepository.save(actualite);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		actualiteRepository.deleteById(id);
	}

}
