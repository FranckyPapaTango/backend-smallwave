package rafaros.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaros.backend.dao.repository.TypecommandeRepository;
import rafaros.backend.entities.Typecommande;

import java.util.List;

@Service
public class TypecommandeServiceImpl implements TypecommandeService{
	
	@Autowired
	TypecommandeRepository typecommandeRepository;

	@Override
	public Typecommande save(Typecommande typecommande) {
		// TODO Auto-generated method stub
		return typecommandeRepository.save(typecommande);
	}

	@Override
	public Typecommande findById(Long id) {
		// TODO Auto-generated method stub
		return typecommandeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Typecommande> findAll() {
		// TODO Auto-generated method stub
		return typecommandeRepository.findAll();
	}

	@Override
	public Typecommande update(Typecommande typecommande) {
		// TODO Auto-generated method stub
		return typecommandeRepository.save(typecommande);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		typecommandeRepository.deleteById(id);
	}

}
