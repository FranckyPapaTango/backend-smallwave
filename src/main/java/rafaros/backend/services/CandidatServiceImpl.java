package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.CandidatRepository;
import rafaros.backend.entities.Candidat;

import java.util.List;

@Service
public class CandidatServiceImpl implements CandidatService {
	
	@Autowired
	CandidatRepository candidatRepository;

	@Override
	public Candidat save(Candidat candidat) {
		// TODO Auto-generated method stub
		return candidatRepository.save(candidat);
	}

	@Override
	public Candidat findById(Long id) {
		// TODO Auto-generated method stub
		return candidatRepository.findById(id).orElse(null);
	}

	@Override
	public List<Candidat> findAll() {
		// TODO Auto-generated method stub
		return candidatRepository.findAll();
	}

	@Override
	public Candidat update(Candidat candidat) {
		// TODO Auto-generated method stub
		return candidatRepository.save(candidat);
	}

	@Override
	public void delete(Long id) {
		candidatRepository.deleteById(id);
		
	}

}
