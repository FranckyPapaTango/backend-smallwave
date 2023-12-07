package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.ChatteurRepository;
import rafaros.backend.entities.Chatteur;

import java.util.List;

@Service
public class ChatteurSerciceImpl implements ChatteurService {
	
	@Autowired
	ChatteurRepository chatteurRepository;

	@Override
	public Chatteur save(Chatteur chatteur) {
		// TODO Auto-generated method stub
		return chatteurRepository.save(chatteur);
	}

	@Override
	public Chatteur findById(Long id) {
		// TODO Auto-generated method stub
		return chatteurRepository.findById(id).orElse(null);
	}

	@Override
	public List<Chatteur> findAll() {
		// TODO Auto-generated method stub
		return chatteurRepository.findAll();
	}

	@Override
	public Chatteur update(Chatteur chatteur) {
		// TODO Auto-generated method stub
		return chatteurRepository.save(chatteur);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		chatteurRepository.deleteById(id);
	}

}
